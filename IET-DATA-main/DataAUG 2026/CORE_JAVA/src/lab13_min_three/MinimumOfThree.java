package lab13_min_three;

import java.util.Scanner;

/**
 * Lab 13: Accept 3 numbers from user and display Minimum from that.
 * Run command: java -cp bin lab13_min_three.MinimumOfThree
 */
public class MinimumOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("         FIND MINIMUM OF THREE NUMBERS            ");
        System.out.println("==================================================");

        System.out.print("Enter first number  (num1): ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number (num2): ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter third number  (num3): ");
        double num3 = scanner.nextDouble();

        double min = num1;
        if (num2 < min) min = num2;
        if (num3 < min) min = num3;

        System.out.println("+------------------------------------------------+");
        System.out.printf("| Numbers Entered : [%.2f, %.2f, %.2f]         |\n", num1, num2, num3);
        System.out.printf("| Minimum Value   : %.2f                           |\n", min);
        System.out.println("+------------------------------------------------+");

        scanner.close();
    }
}
