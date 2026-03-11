import java.util.Scanner;

public class PalindroneCheckerApp {

    // Node class for singly linked list
    static class Node {
        char data;
        Node next;
        Node(char data) { this.data = data; this.next = null; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Text: ");
        String text = sc.nextLine();

        // Step 1: Convert string to linked list
        Node head = null;
        Node tail = null;
        for (char ch : text.toCharArray()) {
            Node newNode = new Node(ch);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Step 2: Find middle using slow and fast pointers
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 3: Reverse second half
        Node secondHalf = reverse(slow);

        // Step 4: Compare first half and reversed second half
        Node firstHalf = head;
        Node tempSecond = secondHalf;
        boolean isPalindrome = true;
        while (tempSecond != null) {
            if (firstHalf.data != tempSecond.data) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            tempSecond = tempSecond.next;
        }

        System.out.println("Is it a Palindrome? : " + isPalindrome);
        sc.close();
    }

    // Helper method to reverse a linked list
    private static Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
}