/**
 * =========================================================
 * MAIN CLASS - PalindromeCheckerApp
 * =========================================================
 *
 * Use Case: Hardcoded Palindrome Validation
 *
 * Description:
 * This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 *
 * The application:
 * - Stores a predefined string
 * - Compares characters from both ends
 * - Determines whether the string is a palindrome
 * - Displays the result on the console
 *
 * @author Developer
 * @version 2.0
 * MAIN CLASS - UseCase1PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 1: Application Entry & Welcome Message
 *
 * Description:
 * This class represents the entry point of the
 * Palindrome Checker Management System.
 *
 * At this stage, the application:
 * - Starts execution from the main() method
 * - Displays a welcome message
 * - Shows application version
 *
 * No palindrome logic is implemented yet.
 *
 * The goal is to establish a clear startup flow.
 *
 * @author Developer
 * @version 1.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point.
     *
     * This is the first method executed by the JVM
     * when the program starts.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Hardcoded test string
        String word = "madam";

        boolean isPalindrome = checkPalindrome(word);

        System.out.println("======================================");
        System.out.println("Palindrome Checker Application");
        System.out.println("======================================");
        System.out.println("Input String: " + word);

        if (isPalindrome) {
            System.out.println("Result: The string IS a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }

    /**
     * Method to check whether a string is a palindrome.
     */
    public static boolean checkPalindrome(String word) {

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
        printWelcomeMessage();
        printVersion();
    }

    /**
     * Displays the welcome message.
     */
    private static void printWelcomeMessage() {
        System.out.println("======================================");
        System.out.println("   Welcome to Palindrome Checker");
        System.out.println("======================================");
    }

    /**
     * Displays application version.
     */
    private static void printVersion() {
        System.out.println("Application Version: 1.0");
        System.out.println("System is ready.");
    }
}