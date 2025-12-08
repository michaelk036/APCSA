/*
Q3 — Total Characters
Given an ArrayList of Strings called words, compute the total number of characters in all strings.
*/
import java.util.ArrayList;

class Total {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        System.out.println(words);

        words.add("adieu");
        words.add("computer");
        words.add("hello");
        words.add("goodbye");
        System.out.println(words);

        int charachters = 0;

        for (int i = 0; i < words.size(); i++) {
            String a = words.get(i);
            charachters += a.length();
        }

        System.out.println(charachters);
    }
}