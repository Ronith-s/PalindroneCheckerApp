import java.util.Scanner;

public class PalindroneCheckerApp {
    public static void main(String[] args) {
        String palindrome;
        Scanner sc = new Scanner(System.in);
        System.out.println("InSput Text: ");
        String palindrone = sc.nextLine();
        String rev_palindrome;
        int count = 0;
        for (int i = 0; i < palindrone.length(); i++) {
            if (palindrone.charAt(i) == palindrone.charAt(palindrone.length() - i - 1)) {
                count++;
            }
        }

        boolean is_palindrone = false;
        if (count == palindrone.length()) {
            is_palindrone = true;
        }
        System.out.println("Is it a Palindrome? : "+is_palindrone);

    }
}