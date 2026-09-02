package lab01_calculator;

/**
 * Lab 01: Command Line Calculator using Switch Case
 * Accepts 3 command line arguments: <number1> <operator> <number2>
 * Run command: java -cp bin lab01_calculator.Calculator 15.5 + 4.5
 */
public class Calculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("+------------------------------------------------------------+");
            System.out.println("| Error: Invalid number of arguments.                        |");
            System.out.println("| Usage: java -cp bin lab01_calculator.Calculator <n1> <op> <n2>|");
            System.out.println("| Supported operators: +, -, *, /, %                         |");
            System.out.println("+------------------------------------------------------------+");
            return;
        }

        try {
            double num1 = Double.parseDouble(args[0]);
            String operator = args[1];
            double num2 = Double.parseDouble(args[2]);

            double result = 0;
            boolean validOperation = true;

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                case "x":
                case "X":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        validOperation = false;
                    } else {
                        result = num1 / num2;
                    }
                    break;
                case "%":
                    if (num2 == 0) {
                        System.out.println("Error: Modulo by zero is not allowed.");
                        validOperation = false;
                    } else {
                        result = num1 % num2;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator '" + operator + "'. Supported: +, -, *, /, %");
                    validOperation = false;
                    break;
            }

            if (validOperation) {
                System.out.println("+----------------------------------------+");
                System.out.printf("| Result: %.2f %s %.2f = %.2f\n", num1, operator, num2, result);
                System.out.println("+----------------------------------------+");
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: Please provide valid numeric values for operands.");
        }
    }
}
