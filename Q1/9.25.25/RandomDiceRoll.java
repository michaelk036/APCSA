/*
Q3: Random Dice Roll
Description: Write a method rollDice() that returns a random integer from 1 to 6, representing a dice roll.

Parameters: None
Returns: Yes
Class Structure: One Class

Sample output:
    You rolled a 4!
*/
class RandomDiceRoll {
    public static void main(String[] args) {
        RandomDiceRoll r = new RandomDiceRoll();
        r.rollDice();
    }
    
    void rollDice() {
        int roll = (int)(Math.random()*6+1); //Math.random*(max - min)+min
        System.out.println("You rolled a " +roll+ "!");
    }
} 