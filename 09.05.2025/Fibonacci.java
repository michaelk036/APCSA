//Q5. WAP to calculate and display the 1st 'n' Fibonacci series
import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        f.fibonacci();
    }

    void fibonacci() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int input = sc.nextInt();

        int previousNumber = 0;
        int number = 1;
        int nextNumber = 0;

        System.out.println("0");
        System.out.println("1");
        for (int i = 1; i <= input; i++) {
            nextNumber = previousNumber+number;
            previousNumber=number;
            number=nextNumber;
            System.out.println(nextNumber);
        }
    }
}