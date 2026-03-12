/**
 * =====================================================
 * MAIN CLASS - UseCase9PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using recursion.
 * Characters are compared from the outer positions
 * moving inward using recursive calls.
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC9.
     */
    public static void main(String[] args) {

        String input = "madam";

        boolean result = check(input, 0, input.length() - 1);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }

    /**
     * Recursively checks whether a string is palindrome.
     */
    private static boolean check(String s, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        return check(s, start + 1, end - 1);
    }
}