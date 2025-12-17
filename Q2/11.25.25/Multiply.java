//multiply 2 arrays
import java.util.Scanner;

class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your desired value for p");
        int m = sc.nextInt();
        System.out.println("Enter your desired value of q"); //same value as 1st thingie in 2nd expression
        int n = sc.nextInt();
        System.out.println("Enter your desired value for r"); 
        int p = sc.nextInt();

        int a[][] = new int[m][n];
        int b[][] = new int[n][p];
        int c[][] = new int[m][p];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter a value for " +a[i][j]);
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                System.out.println("Enter a value for " +b[i][j]);
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) { //3 different for loops cause 3 variables
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    c[i][j] += a[i][k]*b[k][j];
                }
                System.out.print(" "+c[i][j]+" ");
            }
        }
        
    }      
}