package lab25_email_validation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Lab 25: Accept email ID from user and validate format using Regular Expressions.
 * Run command: java -cp bin lab25_email_validation.EmailValidator
 */
public class EmailValidator {

    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
    private static final Pattern PATTERN = Pattern.compile(EMAIL_REGEX);

    public static boolean isValidEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            return false;
        }
        Matcher matcher = PATTERN.matcher(email.trim());
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("            EMAIL ID FORMAT VALIDATOR             ");
        System.out.println("==================================================");

        System.out.print("Enter Email ID to validate: ");
        String userEmail = scanner.nextLine();

        boolean valid = isValidEmail(userEmail);

        System.out.println("\n+------------------------------------------------+");
        System.out.printf("| Input Email ID : %-29s |\n", userEmail);
        if (valid) {
            System.out.println("| Status         :  VALID EMAIL FORMAT           |");
        } else {
            System.out.println("| Status         :  INVALID EMAIL FORMAT         |");
        }
        System.out.println("+------------------------------------------------+");

        if (!valid) {
            System.out.println("\nReason for Invalidity:");
            System.out.println(" - A valid email must follow format: username@domain.extension");
            System.out.println(" - Example of valid email: john.doe@example.com");
        }

        System.out.println("==================================================");
        scanner.close();
    }
}
