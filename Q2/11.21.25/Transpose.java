//3. Find the transpose of a matrix
import java.util.Scanner;

class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your desired number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter your desired number for columns");
        int columns = sc.nextInt();

        int[][] a = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = i;
            }
        }

        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.println(a[j][i]);
            }
        }
    }
}
