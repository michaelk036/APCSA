//Reverse a number
class Reverse {
    public static void main(String[] args) {
        Reversed r = new Reversed();
        r.reverse(546);
    }
}
class Reversed {    
    void reverse(int value) {
        int reverse = 0;
        int number;
        

        while (value > 0) {
            number = value % 10;
            reverse = (reverse * 10) + number;
            value = value / 10;
        }

        System.out.println(reverse);
    }
}