//Q1. WAP to calculate and display the Factorial of a number
import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        f.factor();
    }

    void factor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int input = sc.nextInt();

        int output = 1;x

        for(int i = 1; i <= input; i++) {
            output *= i;
        }

    System.out.println("The factorial of "+input+ " is " +output);
    }
}