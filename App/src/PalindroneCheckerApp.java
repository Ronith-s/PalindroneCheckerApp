import java.util.Scanner;

class PalindromeChecker {
    public boolean checkPalindrome(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }

        String cleaned = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0;
        int end = cleaned.length() - 1;

        while (start < end) {
            if (cleaned.charAt(start) != cleaned.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

public class UseCase11PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PalindromeChecker checker = new PalindromeChecker();

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean isPalindrome = checker.checkPalindrome(input);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? : "+isPalindrome);

        scanner.close();
    }
}