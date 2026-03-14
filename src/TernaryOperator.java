public class TernaryOperator {
    
    public static void main(String[] args){

        // ternary operator ? = Return 1 of 2 values if a condition is true (alternative if else statements)

        // variable = (condition) ? ifTrue : ifFalse;

        /*
        int score = 70;

        String passOrFail = (score >= 60) ? "PASS" : "FAIL";
        */

        /*
        int number = 4;

        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
        */

        /*
        int hours = 9;

        String timeOfDay = (hours < 12) ? "AM" : "PM";
        */

        int income = 30000;

        double taxRate = (income >= 40000) ? 0.25 : 0.15;

        System.out.println(taxRate);

    }
}
