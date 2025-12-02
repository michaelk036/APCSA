import java.util.Scanner;

class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = {5,9,17,23,25,45,59,63,71,89};
        int left = 0;
        int right = array.length-1;

        System.out.println("Enter the number you would like to find");
        int value = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            int mid = (left+right)/2;

            if (value == array[mid]) {
                System.out.println("Your number has been found");
                break;
            }
            else if (value > array[mid]) {
                left = (mid+1); 
            }
            else if (value < array[mid]) {
                right = (mid-1);
            }
            else if (left > right) {
                System.out.println("Your number has not been found");
                break;
            }
        }
    }
}