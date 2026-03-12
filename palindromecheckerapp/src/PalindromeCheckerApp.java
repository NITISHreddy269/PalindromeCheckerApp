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
            }
        }
        return true;
    }
}