/*
Practice questions with parameter passing and returing in Java

WAP to demonstrate the random number generator by asking the user for the start and the end numbers.
Your function should be able to display 20 random numbers between the numbers specified by the user.
*/
import java.util.Scanner;

 class RandomNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the lower bound");
        int lowerBound = sc.nextInt();
        System.out.println("Enter the upper bound");
        int upperBound = sc.nextInt();

        for (int i = 1; i <= 20; i++) {
            int output = (int)(Math.random()*(upperBound - lowerBound + 1)) + lowerBound;
            System.out.println(output);
        }
    }
 }