/*
Practice questions with parameter passing and returing in Java

WAP to demonstrate the random number generator by asking the user for the start and the end numbers.
Your function should be able to display 20 random numbers between the numbers specified by the user.
 */
import java.util.Scanner; 

class Random {
    public static void main(String[] args) {
        Random r = new Random();
        double output = r.random();

        System.out.println((int)output);

    }

    public double random() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the upper Bound");
        double upperBound = sc.nextInt();
        System.out.println("Enter the lower Bound");
        double lowerBound = s.nextInt();
        
        double output = 1; 

        for (int i = 1; i <= 20; i++) {
            output = (Math.random())*(upperBound-lowerBound)*20+1;
        }
        return output;
    }
}
