//Reverse a number

import java.util.Scanner;

class Reverse {
    public static void main(String[] args) {
        Reversed r = new Reversed();
        r.reverse();
    }
}
class Reversed {
    Scanner sc = new Scanner(System.in);
    
    void reverse() {
        System.out.println("Enter a value");
        int value = sc.nextInt();

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