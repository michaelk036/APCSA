/*
Reverse the elements of a 1-D array

Output both the original Arrray and the Reversed Array. 
*/
import java.util.Scanner;

class ReversedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of your array");
        int n = sc.nextInt();

        int array[] = new int[n];

        for (int i = 0; i < array.length; i++) {
            int number = i % 10;
            reverse = (reverse * 10) + number;
            value = value / 10;
        }
    }
}