/*
Practice questions with parameter passing and returing in Java

WAP to demonstrate the random number generator by asking the user for the start and the end numbers.
Your function should be able to display 20 random numbers between the numbers specified by the user.
 */
import java.util.Scanner;

class RandomNumber {
    public static void main(String[] args) {
        Generator r = new Generator();
        int upperBound = r.upperBound();
        int lowerBound = r.lowerBound();

        for (int i = 1; i <= 20; i++) {
            int output = (int)(Math.random()*(upperBound - lowerBound + 1)) + lowerBound;
            System.out.println(output);
        }
    }   
}
class Generator {
    Scanner sc = new Scanner(System.in); 

    public int upperBound() {
        System.out.println("Enter the upper Bound");
        int upperBound = sc.nextInt();
        return upperBound;
    }

    public int lowerBound() {
        System.out.println("Enter the lower Bound");
        int lowerBound = sc.nextInt();
        return lowerBound;
    }
}