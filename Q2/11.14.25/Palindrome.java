class Palindrome {
    public static void main(String[] args) {
        PalindromeCheck p = new PalindromeCheck();
        p.checkPalindrome("noon");
    }
}

class PalindromeCheck {
    boolean checkPalindrome(String input) {
        char[] letters = input.toCharArray();
        String reverse = "";
        boolean output;

        for (int i = letters.length - 1; i >= 0; i--) {
            reverse += letters[i];
        }
        
        if (reverse.equals(input)) {
            output = true;
        }
        else {
            output = false;
        }
        System.out.println(output);
        return output;
    }
}


