import java.util.Scanner;

public class importScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("what's your name?");
        String name = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Where are you from?");
        String city = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("you're " + age + " years old");
        System.out.println("you're from " + city);
    }
}
