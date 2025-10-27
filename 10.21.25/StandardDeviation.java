//1. Calculate and display the result of the Standard Deviation. (e.g. 2,3,4,3. SD=0.70710677) 
import java.util.Scanner;

class StandardDeviation {
    public static void main(String[] args) {
        StandardlyDeviate s = new StandardlyDeviate();
        s.ask();
        s.deviate();
        s.print();
    }
}

class StandardlyDeviate {
    Scanner sc = new Scanner(System.in);
    int size;
    int numberSet[];
    double standardDeviation, meanSum;

    void ask() {
        System.out.println("Enter the size of the data set you want");
        size = sc.nextInt();

        numberSet = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter a number");
            int value = sc.nextInt();

            numberSet[i] = value;
        }
    }

    void deviate() {
        for (int i = 0; i < size; i++) {
            meanSum = numberSet[i];
        }
        double mean = meanSum/size;

        double summation = Math.pow(numberSet[0] - mean,2)/size;
        double StandardDeviation = Math.sqrt(summation);
    }

    void print() {
        System.out.println("Your standard Deviation is" +standardDeviation);
    }
}