class PalindromeCheckerApp {

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

    // Optional main method for testing
    public static void main(String[] args) {
        PalindromeCheckerApp app = new PalindromeCheckerApp();

        System.out.println(app.checkPalindrome("Madam"));               // true
        System.out.println(app.checkPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(app.checkPalindrome("hello"));               // false
    }
}