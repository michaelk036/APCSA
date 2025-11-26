import java.util.Scanner;

class Diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your desired number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter your desired number of columns");
        int columns = sc.nextInt();

        int[][] a = new int[rows][columns];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = i;
            }
        }

        int sum = 0;
        int min;

        if (rows < columns) {
            min = rows;
        } else {
            min = columns;
        }

        for (int i = 0; i < min; i++) {
            sum += a[i][i];
            System.out.println(a[i][i]);
        }

        System.out.println(sum);
    }
}

