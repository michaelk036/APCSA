class InitialsTest {
    public static void main(String[] args) {
        Initials i = new Initials();
        i.getInitials("Nigel Isaiah George Geoffrey Eleanor Ray");
    }
}

class Initials {
    String getInitials(String input) {
        String[] words = input.split(" ");
        String initials = "";

        for (int j = 0; j < words.length; j++) {
            initials += words[j].charAt(0);
        }

        System.out.println(initials);
        return initials;
    }
}
