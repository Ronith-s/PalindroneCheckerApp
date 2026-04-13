class PalindromeCheckerApp {

    // Method 1: Two-pointer approach (your current method)
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

    // Method 2: Using StringBuilder reverse
    public boolean checkPalindromeReverse(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }

        String cleaned = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(reversed);
    }

    // Method 3: Using recursion
    public boolean checkPalindromeRecursive(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }

        String cleaned = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return isPalindromeRec(cleaned, 0, cleaned.length() - 1);
    }

    private boolean isPalindromeRec(String str, int start, int end) {
        if (start >= end) return true;

        if (str.charAt(start) != str.charAt(end)) return false;

        return isPalindromeRec(str, start + 1, end - 1);
    }

    // Main method for performance comparison
    public static void main(String[] args) {
        PalindromeCheckerApp app = new PalindromeCheckerApp();

        String test = "A man, a plan, a canal: Panama";

        // Method 1 timing
        long start1 = System.nanoTime();
        boolean result1 = app.checkPalindrome(test);
        long end1 = System.nanoTime();

        // Method 2 timing
        long start2 = System.nanoTime();
        boolean result2 = app.checkPalindromeReverse(test);
        long end2 = System.nanoTime();

        // Method 3 timing
        long start3 = System.nanoTime();
        boolean result3 = app.checkPalindromeRecursive(test);
        long end3 = System.nanoTime();

        // Results
        System.out.println("Two Pointer Result: " + result1);
        System.out.println("Time: " + (end1 - start1) + " ns\n");

        System.out.println("Reverse Method Result: " + result2);
        System.out.println("Time: " + (end2 - start2) + " ns\n");

        System.out.println("Recursive Method Result: " + result3);
        System.out.println("Time: " + (end3 - start3) + " ns\n");
    }
}