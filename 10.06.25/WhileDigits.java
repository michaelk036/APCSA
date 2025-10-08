//Count the number of digits of a user entered number
import java.util.Scanner;

class WhileDigits {
    public static void main(String[] args) {
        Count c = new Count();
        c.count();
    }
}

class Count {
    Scanner sc = new Scanner(System.in);
    int number;
    int digits = 0;
    int temp;

    void count() {
        System.out.println("Enter a number");
        number = sc.nextInt();

        while (number > 0) {
            temp = number%10; 
            number = number/10;
            digits++;            
        }
        System.out.println("The number of digits in your number is " +digits);
    }
}