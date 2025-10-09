//Display the sum of the digits of a user entered number
 
import java.util.Scanner;

class WhileSum {
    public static void main(String[] args) {
        Addition a = new Addition();
        a.add();       
    }
}

class Addition {
    Scanner sc = new Scanner(System.in);
    
    void add() {
        System.out.println("Enter a number");
        int number = sc.nextInt();
        
        int sum = 0;

        while (number > 0) {
            int temp = number%10;
            sum += temp;
            number = number/10;
        }
    System.out.println("The sum of the digits of your number is " +sum);
    }
}