import java.util.Scanner;

public class WhileLoops {
    
    public static void main(String[] args){

        // while loop = repeat some code forever
        //              while some condition remains true

        Scanner scanner = new Scanner(System.in);

        /*
        String name = "";

        while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);
        */

        /*
        String response = "";

        while(!response.equals("Q")){

            System.out.println("You are playing a game");
            System.out.print("Press Q to quit: ");
            response = scanner.nextLine().toUpperCase();
        }

        System.out.println("You have quit the game!");
        */

        /*
        int age = 0;

        do{
            System.out.println("Your age can't be negative");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }while(age < 0);

        System.out.println("Your are " + age + " years old");
        */

        int number = 0;

        do{
            System.out.print("Enter a number between 1 - 10: ");
            number = scanner.nextInt();
        }while(number < 1 || number > 10);

        System.out.println("You picked " + number);

        scanner.close();

    }
}
