/*
Q4 — Find the Longest Word
Given an ArrayList of Strings, find and print the longest word.
*/
import java.util.ArrayList;

class Long {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        System.out.println(words);

        words.add("longestword");
        words.add("computer");
        words.add("hello");
        words.add("yes");
        words.add("no");
        words.add("goodbye");
        System.out.println(words);

        String longest = "";

        /* 
        for (int i = 0; i < words.size(); i++) {
            String a = words.get(i);
            if (a.length() > longest.length()) {
                longest = words.get(i);
            }
        }

        Because the size changes certain values are skipped - use i--
        */
        for (int i = words.size()-1; i > 0; i--) {
            String a = words.get(i);
            if (a.length() > longest.length()) {
                longest = words.get(i);
            }
        }

        System.out.println(longest);
    }
}