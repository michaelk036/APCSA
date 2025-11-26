//2. WAP to count the number of vowels, blank spaces, digits, and consonants in a string.
class StringCount {
    public static void main(String[] args) {
        Counting v = new Counting();
        String input = "What a wonderful input i'm inputting today on November 18th 2025";
        v.vowelCheck(input);
        v.consonantCheck(input);
        v.spacesCheck(input);
        v.digitsCheck(input);
    }
}

class Counting {

    int vowelCheck(String array) {
        char[] letters = array.toCharArray();
        char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};

        int count = 0;
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (letters[i] == vowels[j]) {
                    count += 1;
                }
            }
        }
        System.out.println("The number of vowels is " + count);
        return count;
    }

    int consonantCheck(String array) {
        char[] letters = array.toCharArray();
        char[] consonants = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z','B','C','D','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','W','X','Y','Z'};

        int count = 0;
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < consonants.length; j++) {
                if (letters[i] == consonants[j]) {
                    count += 1;
                }
            }
        }
        System.out.println("The number of consonants is " + count);
        return count;
    }

    int spacesCheck(String array) {
        char[] letters = array.toCharArray();

        int count = 0;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == ' ') {
                count += 1;
            }
        }
        System.out.println("The number of spaces is " + count);
        return count;
    }

    int digitsCheck(String array) {
        char[] letters = array.toCharArray();

        int count = 0;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] >= '0' && letters[i] <= '9') {
                count += 1;
            }
        }
        System.out.println("The number of digits is " + count);
        return count;
    }
}

