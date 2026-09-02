package lab19_cmd_convert;

/**
 * Lab 19: Command Line String to Integer wrapper and int primitive parsing.
 * Accepts 2 numbers as command line arguments (String type).
 * Run command: java -cp bin lab19_cmd_convert.CommandLineConversion 25 4
 */
public class CommandLineConversion {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("     COMMAND LINE PARSING & CONVERSION DEMO       ");
        System.out.println("==================================================");

        if (args.length < 2) {
            System.out.println("Error: Please provide 2 command line number arguments.");
            System.out.println("Usage: java -cp bin lab19_cmd_convert.CommandLineConversion <num1> <num2>");
            return;
        }

        try {
            String strArg1 = args[0];
            String strArg2 = args[1];

            System.out.println("Raw String Argument 1        : \"" + strArg1 + "\"");
            System.out.println("Raw String Argument 2        : \"" + strArg2 + "\"");

            Integer objectNum1 = Integer.valueOf(strArg1);
            Integer objectNum2 = Integer.valueOf(strArg2);
            Integer additionResult = objectNum1 + objectNum2;

            System.out.println("\n--- Addition (Using Integer Wrapper Objects) ---");
            System.out.println("Integer.valueOf(\"" + strArg1 + "\") + Integer.valueOf(\"" + strArg2 + "\") = " + additionResult);

            int primitiveNum1 = Integer.parseInt(strArg1);
            int primitiveNum2 = Integer.parseInt(strArg2);
            int multiplicationResult = primitiveNum1 * primitiveNum2;

            System.out.println("\n--- Multiplication (Using Primitive int Data Types) ---");
            System.out.println("Integer.parseInt(\"" + strArg1 + "\") * Integer.parseInt(\"" + strArg2 + "\") = " + multiplicationResult);

            System.out.println("==================================================");

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input! Please pass valid integer arguments.");
        }
    }
}
