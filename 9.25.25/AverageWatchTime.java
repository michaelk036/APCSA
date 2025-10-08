/*
Description: Write a method averageWatchTime() that returns the average of three integers representing video watch times.

Parameters; Yes (int minutes1, minutes2, minutes3)
Returns: Yes(double)
Class Structure: One Class

Sample Output: 
    Average watch time = 15.0 minutes
*/
import java.util.Scanner;

class AverageWatchTime {
    public static void main(String[] args) {
        averageWatchTime();
    }

    static void averageWatchTime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st watchtime"); //fix pass parameters not scanner
        int watchtime1 = sc.nextInt();
        System.out.println("Enter the 2nd watchtime");
        int watchtime2 = sc.nextInt();
        System.out.println("Enter the 3rd watchtime");
        int watchtime3 = sc.nextInt();

        int totalWatchTime = watchtime1+watchtime2+watchtime3;
        double averageWatchTime = totalWatchTime/3;

        System.out.println("Average watch time = " +averageWatchTime+ " minutes");
    }
}