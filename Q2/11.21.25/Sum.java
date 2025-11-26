import java.util.Scanner;

class Sum {
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

        int rowSum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                rowSum += a[i][j];
            }
        }
        System.out.println("Row Sum: " + rowSum);

        int columnSum = 0;
        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < rows; i++) {
                columnSum += a[i][j];
            }
        }
        System.out.println("Column Sum: " + columnSum);
    }
}
