class Vowels {
    public static void main(String[] args) {
        VowelCheck v = new VowelCheck();
        v.vowelCheck("What a wonderful input");
    }
}

class VowelCheck {
    int vowelCheck(String array) {
        String[] vowels = {"a","e","i","o","u","A","E","I","O","U"};

        String[] letters = array.split("");

        int count = 0;
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (letters[i].equals(vowels[j])) {
                        count += 1;
                }
            }
        }
        System.out.println("The number of vowels is " + count);
        return count;
    }
}



