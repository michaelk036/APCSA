class ReverseString {
    public static void main(String[] args) {
        Reverse r = new Reverse();
        r.Reversing("What a wonderful input i have");
    }
}

class Reverse {
    String Reversing(String input) {
        String[] letters = input.split("");
        String reverse = "";

        for (int i = letters.length-1; i > 0; i--) {
            reverse += letters[i];
        }

        System.out.println(reverse);
        return reverse;
    }
}

