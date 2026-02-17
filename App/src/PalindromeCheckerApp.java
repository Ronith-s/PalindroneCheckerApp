import java.util.Scanner;

public class PalindromeCheckerApp{
    public static void main(String[] args){
        String palindrome;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Palindrome to be checked: ");
        palindrome = sc.nextLine();
        String rev_palindrome;
        int count = 0;
        for(int i = 0; i < palindrome.length();i++){
            if( palindrome.charAt(i) == palindrome.charAt(palindrome.length()-i-1)){
                count++;
            }
        }
        if(count == palindrome.length()){
            System.out.println(palindrome + " is a palindrome: ");
        }else{
            System.out.println(palindrome + " is not a palindrome");
        }

    }

}