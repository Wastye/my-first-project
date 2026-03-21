import java.util.Random;

public class RandomNumbers {
    
    public static void main(String[] args){

        Random random = new Random();

        int number1;
        int number2;
        int number3;

        double number;

        boolean isHeads;

        number1 = random.nextInt(1, 101); // Second number is exclusive!
        number2 = random.nextInt(1, 101);
        number3 = random.nextInt(1, 101);

        number = random.nextDouble();

        isHeads = random.nextBoolean();

        if(isHeads){
            System.out.println("HEADS");
        }
        else{
            System.out.println("TAILS");
        }

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        System.out.println(number);

    }
}
