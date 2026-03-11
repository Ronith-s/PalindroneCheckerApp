import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean result = true;
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                result = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Input: " + input);
        if (result) {
            System.out.println("Verdict: It is a palindrome.");
        } else {
            System.out.println("Verdict: It is not a palindrome.");
        }

        scanner.close();
    }
}