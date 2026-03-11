import java.util.Scanner;

public class UseCase9PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();

        boolean result = isPalindromeRecursive(cleanedInput, 0, cleanedInput.length() - 1);

        System.out.println("Input: " + input);
        if (result) {
            System.out.println("Verdict: It is a palindrome.");
        } else {
            System.out.println("Verdict: It is not a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return isPalindromeRecursive(str, start + 1, end - 1);
    }
}