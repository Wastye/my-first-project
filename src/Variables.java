public class Variables {
    public static void main(String[] args) {
        
        // ❎ Variable = a reusable container for a value
        //            a Variable behaves as if it was the value it contains

        // 🟥 Primitive = simple value stored directly in memory (stack)
        // 🟦 Reference = memory address (stack) that points to the (heap)

        // 🟥 Primitive vs 🟦 Reference
        //     ---------       ---------
        //     int             string
        //     double          array
        //     char            object
        //     boolean

        // 2 Steps to creating a variable
        // -------------------------------
        // 1. declaration
        // 2. assignment

        int age = 19;
        int year = 2026;
        int quantity = 1;

        double price = 19999.99;
        double gpa = 3.5;
        double temperature = -12.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = false; // we use camelCase naming convention
        boolean forSale = true;
        boolean isOnline = true;

        String name = "Wastie";
        String food = "pizza";
        String email = "fake123@gmail.com";
        String car = "BMW";
        String color = "black";

        System.out.println("Your choice is a " + color + " " + year + " " + car);
        System.out.println("The price is: " + currency + price);

        if(forSale){
            System.out.println("There is a " + car + " for sale");
        }
        else{
            System.out.println("The " + car + " is not for sale");
        }

        /* System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is: " + gpa);
        System.out.println("Your average letter grade is: " + grade);
        */

        // System.out.println("The year is " + year);
        // System.out.println("$" + price);
        // System.out.println(currency);
        // System.out.println(isOnline);

        /* if(isStudent){ // full version - (isStudent == true)
            System.out.println("You are a student");
        }
        else{
            System.out.println("You are NOT a student");
        }
        */

    }
}
