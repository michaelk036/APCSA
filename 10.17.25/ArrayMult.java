/*
3. Display a multiplication table using 1D array

Outputs 
*/
import java.util.Scanner;

class ArrayMult {
    public static void main(String[] args) {
        Mult m = new Mult();
        m.Multiple();
    }
}

class Mult {
    void Multiple() {
        Scanner sc = new Scanner(System.in);
            
        System.out.println("Enter a number");
        int value = sc.nextInt();

        System.out.println("Enter the number of rows you want in your multiplication table");
        int n = sc.nextInt();

        int mult[] = new int[n];
            
        for (int i = 0; i < n; i++) {
            mult[i]=i;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(mult[i]*value);
        }
    }
}
