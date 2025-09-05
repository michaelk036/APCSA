//Q2. WAP to calculate and display the First 'n' Odd numbers
import java.util.Scanner;

class Odd {
    public static void main(String[] args) {
        Odd o = new Odd();
        o.odd();
    }

    void odd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int input = sc.nextInt();

        int counter = 1;
        System.out.println("1");

        for (int i = 1; i <= input-1; i++) {
            counter += 2; 
            System.out.println(counter);
        }
    }
}