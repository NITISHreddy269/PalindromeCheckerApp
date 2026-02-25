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
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point.
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
    }
}