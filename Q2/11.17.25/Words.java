//3. WAP that returns how many words are in a sentence. Assume words are separated by spaces.
class Words {
    public static void main(String[] args) {
        Wording w = new Wording();
        w.words("What an amazing input or not ");
    }
}

class Wording {
    int words(String input) {
        String[] words = input.split(" ");
        int word =  words.length;
        System.out.println(word + " words in a sentence");
        return word;
    }
}

