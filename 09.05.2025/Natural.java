//Q4. WAP to calculate and display the Sum of the 1st 'n' natural numbers
import java.util.Scanner;

class Natural {
    public static void main(String[] args) {
        Natural a = new Natural();
        a.count();
    }

    void count() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int input = sc.nextInt();

        int output = 0;

        for (int i = 1; i <= input; i++) {
            output+=i;
        }
    System.out.println("The sum of the first " +input+ " natural numbers, is " +output);
    }
}