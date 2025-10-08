/*
- Write a program that picks a random number from 1-100. (Use the random number function in Java)
- The user keeps guessing as long as their guess is wrong,  they have guessed less than 7 times.
- If their guess is higher than the number, say "Too high." If their guess is lower than the number, say "Too low."
- When they get it right, the game stops. Or, if they hit seven guesses, the game stops even if they never got it right.
Done
*/

import java.util.Scanner;

class WhileRandom {
    public static void main(String[] args) {
        Random r = new Random();
        r.randomize();
        r.guess();
        
    }
}
class Random {
    Scanner sc = new Scanner(System.in);
    int value, guess;
    int counter = 0;

    void randomize() {
        value = (int)(Math.random()*90)+1;
    }

    void guess() {
        while (counter < 7) {
            System.out.println("Enter your guess");
            guess = sc.nextInt(); 
            
            if (guess == value) {
                System.out.println("Correct!");
                break;
            }
            else if (guess < value) {
                System.out.println("Too low!");
            }
            else if (guess > value) {
                System.out.println("Too high");
            }
            counter++;
        }
    }  
}
