package lab14_max_three;

import java.util.Scanner;

/**
 * Lab 14: Accept 3 numbers from user and display Maximum number from that.
 * Run command: java -cp bin lab14_max_three.MaximumOfThree
 */
public class MaximumOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("         FIND MAXIMUM OF THREE NUMBERS            ");
        System.out.println("==================================================");

        System.out.print("Enter first number  (num1): ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number (num2): ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter third number  (num3): ");
        double num3 = scanner.nextDouble();

        double max = num1;
        if (num2 > max) max = num2;
        if (num3 > max) max = num3;

        System.out.println("+------------------------------------------------+");
        System.out.printf("| Numbers Entered : [%.2f, %.2f, %.2f]         |\n", num1, num2, num3);
        System.out.printf("| Maximum Value   : %.2f                           |\n", max);
        System.out.println("+------------------------------------------------+");

        scanner.close();
    }
}
