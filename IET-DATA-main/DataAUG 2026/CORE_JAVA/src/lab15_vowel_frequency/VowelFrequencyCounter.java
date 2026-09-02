package lab15_vowel_frequency;

import java.util.Scanner;

/**
 * ============================================================================
 * LAB 15: VOWEL COUNTER & INDIVIDUAL FREQUENCY ANALYSIS
 * ============================================================================
 * Add-on Relationship:
 *  - ENHANCED VERSION of basic vowel counting.
 *  - Extends basic vowel counting by calculating BOTH total vowel count AND
 *    individual frequency distribution for each vowel ('a', 'e', 'i', 'o', 'u').
 *
 * Eclipse Run Command: Right-click -> Run As -> Java Application
 * Command Line Run: java -cp bin lab15_vowel_frequency.VowelFrequencyCounter
 * ============================================================================
 */
public class VowelFrequencyCounter {

    /**
     * Analyzes string input to calculate total vowels and individual vowel occurrences.
     * @param input raw input string
     */
    public static void analyzeVowels(String input) {
        int totalVowels = 0;
        int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;

        String lowerStr = input.toLowerCase();

        for (int i = 0; i < lowerStr.length(); i++) {
            char ch = lowerStr.charAt(i);
            switch (ch) {
                case 'a': countA++; totalVowels++; break;
                case 'e': countE++; totalVowels++; break;
                case 'i': countI++; totalVowels++; break;
                case 'o': countO++; totalVowels++; break;
                case 'u': countU++; totalVowels++; break;
                default: break;
            }
        }

        System.out.println("\n+--------------------------------------------------+");
        System.out.printf("| Input String : %-33s |\n", input);
        System.out.printf("| Total Vowel Count: %-29d |\n", totalVowels);
        System.out.println("+--------------------------------------------------+");
        System.out.println("Individual Vowel Breakdown:");
        System.out.println("  a - " + countA);
        System.out.println("  e - " + countE);
        System.out.println("  i - " + countI);
        System.out.println("  o - " + countO);
        System.out.println("  u - " + countU);
        System.out.println("----------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("    VOWEL COUNTER & INDIVIDUAL FREQUENCY          ");
        System.out.println("==================================================");

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        analyzeVowels(inputString);

        scanner.close();
    }
}
