public class printf {

    public static void main(String[] args) {

        // printf() = an optional method to control, format and display text to the
        // console window
        // two arguments = format string + (object/ variable/ value)
        // % [flags] [precision] [width] [conversion-character]

        // System.out.printf("this is a format string %d", 123);

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "freedus";
        int myInt = 50;
        double myDouble = 1000;

        // System.out.printf("%b", myBoolean);

        // System.out.printf("%c", myChar);

        // System.out.printf("%s", myString);

        // System.out.printf("%d", myInt);

        // System.out.printf("%f", myDouble);

        // [width]
        // minimun number of characters to be written as output
        System.out.printf("Hello %20s\n", myString);

        // [precision]
        // sets number of digits of precision when outputting floating-point values
        System.out.printf("you have this much money %.2f\n", myDouble);

        // [flags]
        // adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus ( + ) or a minus ( - ) sign for a numeric value
        // , : comma grouping separator if numbers > 1000

        // System.out.printf("you have this much money %+f\n", myDouble);

        // System.out.printf("you have this much money %020f\n", myDouble);

        System.out.printf("you have this much money %,f\n", myDouble);
    }

}
