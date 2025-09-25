/*
Question 3: The Dice Roller Game

Create a class called DiceGame.
- Each game has a playerName (String) and numberfRolls (int).
- The default constructor should set playerName = "Guest" and numberfRolls = 1.
- The parameterized constructor should set both values.
- Write a method playGame() that:
- Rolls a die (Math.random() between 1-6) for the number of rolls.
- Calculates the total score.
- If the total score is more than 15, print "You win!", otherwise print "You lose!.

1. Create one game with the default constructor.
2. Create another game with the parameterized constructor.
3. Call playGame() on both.
*/
class Gambling {
    public static void main(String[] args) {
        DiceGame g = new DiceGame();
        g.playGame();

        DiceGame g1 = new DiceGame("Michael",5);
        g1.playGame();
    }
}

class DiceGame {
    String playerName;
    int numberofRolls;
    int totalScore = 0;

    DiceGame() {
        playerName = "Guest";
        numberofRolls = 1;
    }

    DiceGame(String name, int rolls) {
        playerName = name;
        numberofRolls = rolls;
    }

    void playGame() {
        for (int i = 1; i <= numberofRolls; i++) {
            int roll = (int) (Math.random()*6+1); //Math.random*(max - min)+min
            System.out.println(roll);
            
            totalScore += roll;
        }       
        if (totalScore >=15) {
            System.out.println(playerName+" wins");
        }
        else {
            System.out.println(playerName+ "loses");
        }
    }    
}