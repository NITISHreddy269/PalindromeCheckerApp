import java.util.Scanner;
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
     * Application entry point for UC3.
     * Application entry point.
     *
     * This is the first method executed by the JVM
     * when the program starts.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Build reversed string
        String reversed = "";

        // Iterate from the last character to the first
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Compare original and reversed strings
        if (input.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        scanner.close();
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