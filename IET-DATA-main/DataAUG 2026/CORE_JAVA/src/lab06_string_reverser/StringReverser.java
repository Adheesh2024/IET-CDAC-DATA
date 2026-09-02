package lab06_string_reverser;

import java.util.Scanner;

/**
 * Lab 06: String Reverser
 * Run command: java -cp bin lab06_string_reverser.StringReverser
 */
public class StringReverser {

    public static String reverseUsingLoop(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static String reverseUsingStringBuilder(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string to reverse: ");
        String input = scanner.nextLine();

        System.out.println("\n+----------------------------------------+");
        System.out.println("|           REVERSAL RESULTS             |");
        System.out.println("+----------------------------------------+");
        System.out.printf("| Original : %-27s |\n", input);
        System.out.printf("| Loop     : %-27s |\n", reverseUsingLoop(input));
        System.out.printf("| Built-in : %-27s |\n", reverseUsingStringBuilder(input));
        System.out.println("+----------------------------------------+");

        scanner.close();
    }
}
