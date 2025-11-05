//2. WAP to check if a number is found in a 1D array
import java.util.Scanner;

class ArrayCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements you want in the array");
        int size = sc.nextInt();

        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("What value do you want as the " +i+ " place of the array");
            int value = sc.nextInt();

            array[i] = value;
        }

        System.out.println("What value are you looking for within the array");
        int check = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (array[i] == check) {
                System.out.println("Your value is included in the array! At " +i+ ".");
                break;
            }
            else if (i != check) {
                System.out.println("Your value isn't included in the array");
                break;
            }
        }
    }
}