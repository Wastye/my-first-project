import java.util.Scanner;

public class UserInputCommonIssues{
    public static void main(String[] args){

        // COMMON ISSUES

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Cleaning buffer (\n)

        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();

        System.out.println("You are " + age + " years old");
        System.out.println("You like the color " + color);

        scanner.close();

    }
}