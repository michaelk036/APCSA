/*
Multiply every element of your array by 'n'

Instead of 'int a[] = new int[n]' -use-> a.length to get the size
 */
import java.util.Scanner;

class MultiplyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int array[] = new int[6];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number for the " +i+ " place in the array");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            array[i]*=array.length;
        }

        for (int a:array) {
            System.out.print(" " +a+ " ");
        }
    }
}