//Display the sum of the cube of the individual digits of a number
import java.util.Scanner;

class WhileCube {
    public static void main(String[] args) {
        Add a = new Add();
        a.add();       
    }
}

class Add {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    int number;
    
    void add() {
        System.out.println("Enter a number");
        number = sc.nextInt();

        while (number > 0) {
            int temp = number%10;
            sum += (int) Math.pow(temp,3);
            number = number/10;
        }
    System.out.println("The sum of the digits of your number is " +sum);
    }
}
