//Q3. WAP to calculate and display the Odd numbers up to 'n'
import java.util.Scanner;

class Odd2 {
    public static void main(String[] args) {
        Odd2 o = new Odd2();
        o.odd();
    }

    void odd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int input = sc.nextInt();

        for (int i = 1; i <= input; i++) {
            if (i%2!=0) {
                System.out.println(i);
            }
            else {}
        }
        
    }
}