import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "Level";

        long startTime = System.nanoTime();

        boolean isPalindrome = checkPalindrome(input);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + isPalindrome);
        System.out.println("Execution Time: " + duration + " ns");
    }

    private static boolean checkPalindrome(String text) {
        if (text == null) return false;
        String clean = text.toLowerCase();
        int left = 0;
        int right = clean.length() - 1;
        while (left < right) {
            if (clean.charAt(left++) != clean.charAt(right--)) {
                return false;
/**
 * =====================================================
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 10: Normalized Palindrome Validation
 *
 * Description:
 * This class validates a palindrome after preprocessing
 * the input string.
 *
 * Normalization includes:
 * - Removing spaces and symbols
 * - Converting to lowercase
 *
 * Example:
 * "A man a plan a canal Panama"
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC10.
     */
    public static void main(String[] args) {
        PalindromeService service = new PalindromeService();
        String input = "racecar";

        boolean result = service.checkPalindrome(input);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + result);
    }
}

class PalindromeService {

    public  boolean checkPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
        String input = "A man a plan a canal Panama";

        // Normalize the string: remove non-letters and convert to lowercase
        String normalized = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {

            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        return true;

        System.out.println("Input : " + input);
        System.out.println("Normalized : " + normalized);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}