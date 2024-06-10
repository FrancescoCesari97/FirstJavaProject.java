
import java.util.Scanner;

// !/ How to genarete ramdom values
import java.util.Random;

public class arithmeticOperations {

    public static void main(String[] args) {

        // int x = 10;
        // int y = 2;
        // int z = x % y;
        // x += 3; // x = x + 3;

        // System.out.println(Math.abs(-55));

        // System.out.println(Math.min(81, 41));

        // System.out.println(Math.max(81, 41));

        // System.out.println(Math.pow(7, 3));

        // System.out.println(Math.sqrt(30));

        // System.out.println(Math.PI);

        // !/ program to calculate the hypotenuse of a right triangle

        // Scanner scanner = new Scanner(System.in);

        // double x;
        // double y;
        // double z;

        // System.out.println("Enter side x: ");
        // x = scanner.nextDouble();

        // System.out.println("Enter side y: ");
        // y = scanner.nextDouble();

        // z = Math.sqrt((x * x) + (y * y));

        // System.out.println(z);

        // !/

        // !/ How to genarete ramdom values

        Random random = new Random();

        int x = random.nextInt(6) + 1;

        Double y = random.nextDouble(15);

        boolean z = random.nextBoolean();

        System.out.println(z);

    }

}
