/*
Q1: Game Scoreboard
Description: Write a method countdown() that prints a countdown from 5 to 1 and then prints Go!

Parameters: None
Returns: None
Class Structure: One class (main+method in the same class)

Sample Output: 
    Game starting in...
    5
    4
    3
    2
    1
    Go!
 */
class GameScoreboard {
    public static void main(String[] args) {
        GameScoreboard g = new GameScoreboard();
        g.countdown();
    }

    void countdown() {
        System.out.println("Game Starting in...");
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Go!");
    }
}