public class PrintF {
    
    public static void main(String[] args){

        // printf() = is a method used to format output

        // %[flags][weidth][.precision][specifier-character]

        // [specifier-character]
        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name); // %s - string
        System.out.printf("Your name starts with a %c\n", firstLetter); // %c - char
        System.out.printf("You are %d years old\n", age); // %d - int
        System.out.printf("You are %f inches tall\n", height); // %f - double
        System.out.printf("Employed: %b\n", isEmployed); // %b - boolean

        System.out.printf("%s is %d years old\n", name, age);

        // [.precision] and [flags]

        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        // default - 6 digits after the decimal point
        System.out.printf("% .2f\n", price1);
        System.out.printf("% .2f\n", price2);
        System.out.printf("% .2f\n", price3);

        // [weidth]

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1); // add 3 zeros
        System.out.printf("%04d\n", id2); // add 2 zeros
        System.out.printf("%04d\n", id3); // add 1 zeros
        System.out.printf("%04d\n", id4); // add 0 zeros

        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);

        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);

    }
}
