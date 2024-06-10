import java.util.Scanner;

public class logicOperator {

    public static void main(String[] args) {

        // int x = 10;
        // int y = 12;
        // boolean result = 3 > 10;

        // boolean x = 3 < 10 && 3 % 2 == 0;
        // boolean x = 3 < 10 || 3 % 2 == 0;

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("you are playing a game! Press q or Q to quit");
        // String response = scanner.next();

        // if (response.equals("q") || response.equals("Q")) {
        // System.out.println("you quit the game");
        // } else {

        // System.out.println("you are still playing the game");
        // }

        // !/ if statement

        // boolean isOnline = true;

        // if (isOnline) {
        // System.out.println("is Online");
        // }

        // int age = 17;

        // if (age >= 18) {
        // System.out.println("you can drink alchol");
        // } else {
        // System.out.println("you can't drink alchol");
        // }

        // System.out.println(!(3 > 10));

        // !/ switch statement allows a variable to be tested for equality against a
        // list of values

        String day = "prova";

        switch (day) {

            case "Monday":
                System.out.println("it's Monday");
                break;
            case "Tuesday":
                System.out.println("it's Tuesday");
                break;
            case "Wednesady":
                System.out.println("it's Wednesady");
                break;
            case "Thursday":
                System.out.println("it's Thursday");
                break;

            case "Friday":
                System.out.println("it's Friday");
                break;

            case "Saturday":
                System.out.println("it's Saturday");
                break;

            case "Sunday":
                System.out.println("it's Sunday");
                break;

            default:
                System.out.println("it's not a day");
                break;
        }

        // !/

        // !/ while loop

        Scanner scanner = new Scanner(System.in);

        String name = "";

        while (name.isBlank()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);

        // !/
    }

}
