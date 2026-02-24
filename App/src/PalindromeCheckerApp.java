import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input:");
        String input = sc.nextLine();

        // Stack to hold characters
        Stack<Character> stack = new Stack<>();

        // Push each character onto the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Pop characters to build the reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        // Check palindrome
        boolean isPalindrome = input.equals(reversed);

        System.out.println("Is it a Palindrome? : " + isPalindrome);

        sc.close();
    }
}