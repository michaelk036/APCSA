//1. Take input and display the contents of a 1D array
import java.util.Scanner;

class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many elements do you want in the array");
        int size = sc.nextInt();

        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("What value do you want as the " +i+ " place of the array");
            int value = sc.nextInt();

            array[i] = value;
        }

        for (int i = 0; i < size; i ++) {
            System.out.println(array[i]);
        }
    }
}