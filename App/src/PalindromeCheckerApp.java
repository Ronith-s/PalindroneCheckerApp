import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a word/phrase to check: ");
        String original = sc.nextLine();


        String cleanedInput = original.toLowerCase().replace(" ", "");
        String reversed = "";


        for (int i = cleanedInput.length() - 1; i >= 0; i--) {

            reversed += cleanedInput.charAt(i);
        }


        System.out.println("--- Results ---");
        System.out.println("Original: " + cleanedInput);
        System.out.println("Reversed: " + reversed);


        if (cleanedInput.equals(reversed)) {
            System.out.println("Verdict: It's a Palindrome!");
        } else {
            System.out.println("Verdict: Not a Palindrome.");
        }

        sc.close();
    }
}