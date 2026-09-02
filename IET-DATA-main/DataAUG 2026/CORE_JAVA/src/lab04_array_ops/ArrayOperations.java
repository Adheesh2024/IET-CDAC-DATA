package lab04_array_ops;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Lab 04: Menu Driven Array Operations
 * Run command: java -cp bin lab04_array_ops.ArrayOperations
 */
public class ArrayOperations {

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        return min;
    }

    public static int searchNumber(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }

    public static int findOccurrences(int[] arr, int key) {
        int count = 0;
        for (int num : arr) {
            if (num == key) count++;
        }
        return count;
    }

    public static long calculateSum(int[] arr) {
        long sum = 0;
        for (int num : arr) sum += num;
        return sum;
    }

    public static void displaySquareOfEvenNumbers(int[] arr) {
        boolean foundEven = false;
        System.out.print("Squares of even numbers: ");
        for (int num : arr) {
            if (num % 2 == 0) {
                long square = (long) num * num;
                System.out.print(num + "^2 = " + square + "  ");
                foundEven = true;
            }
        }
        if (!foundEven) System.out.print("No even numbers found.");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Invalid array size!");
            scanner.close();
            return;
        }

        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integer elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element [" + i + "]: ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Array Elements: " + Arrays.toString(numbers));

        int choice;
        do {
            System.out.println("\n+----------------------------------------+");
            System.out.println("|     MENU DRIVEN ARRAY OPERATIONS       |");
            System.out.println("+----------------------------------------+");
            System.out.println("| 1. Find Maximum Element                |");
            System.out.println("| 2. Find Minimum Element                |");
            System.out.println("| 3. Search a Number                     |");
            System.out.println("| 4. Find Occurrences of a Number        |");
            System.out.println("| 5. Display Addition of Array Elements  |");
            System.out.println("| 6. Display Square of Even Numbers      |");
            System.out.println("| 7. Exit                                |");
            System.out.println("+----------------------------------------+");
            System.out.print("Enter choice (1-7): ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("--> Maximum Element = " + findMax(numbers));
                    break;
                case 2:
                    System.out.println("--> Minimum Element = " + findMin(numbers));
                    break;
                case 3:
                    System.out.print("Enter number to search: ");
                    int target = scanner.nextInt();
                    int idx = searchNumber(numbers, target);
                    if (idx != -1) System.out.println("--> Number " + target + " found at index " + idx);
                    else System.out.println("--> Number " + target + " not found.");
                    break;
                case 4:
                    System.out.print("Enter number to count: ");
                    int countKey = scanner.nextInt();
                    System.out.println("--> Occurrences of " + countKey + " = " + findOccurrences(numbers, countKey));
                    break;
                case 5:
                    System.out.println("--> Addition of Elements = " + calculateSum(numbers));
                    break;
                case 6:
                    displaySquareOfEvenNumbers(numbers);
                    break;
                case 7:
                    System.out.println("Exiting Array Operations.");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }

        } while (choice != 7);

        scanner.close();
    }
}
