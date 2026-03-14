import java.util.Scanner;

public class WeightConverter {
    
    public static void main(String[] atgs){

        // WEIGHT CONVERSION PROGRAM

        // Declare variables

        // welcome message

        // promt for user choice

        // option 1 convert lbs to kgs

        // option 2 convert kgs to lbs

        // else print not a valid choice

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is: %.2f\n", newWeight);
            
        }
        else if(choice == 2){
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight / 0.453592;
            System.out.printf("The new weight in lbs is: %.2f\n", newWeight);
        }
        else{
            System.out.println("That was not a valid choice");
        }
        
        scanner.close();
    }
}
