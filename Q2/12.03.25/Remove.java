/*
Q5 — Remove All Short Words
Given an ArrayList of Strings, remove every word with length < 4.
*/
import java.util.ArrayList;

class Remove {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        System.out.println(words);

        words.add("long");
        words.add("computer");
        words.add("hello");
        words.add("yes");
        words.add("no");
        words.add("goodbye");
        System.out.println(words);

        for (int i = 0; i < words.size(); i++) {
            String a = words.get(i);

            if (a.length() < 4) {
                words.remove(i);
            }
        }
        System.out.println(words);
    }
}