class PalindromeCheck {
    
    public static void checkPalindrome() {
        int num = 121;
        int temp = num;
        int rev = 0;

        for (int i = temp; i > 0; i = i / 10) {
            int remainder = i % 10;
            rev = rev * 10 + remainder;
        }
        
        if (num == rev) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        checkPalindrome();
    }
}
