/*
Description: Write a method levelUp() in a separate class Game that checks if the total XP (current+bonus) is enough to level up.
Return "Level Up!" or "Keep going!"

Parameters: Yes (int currentXP, int bonusXP)
Returns: Yes (String)
Class Structure: Two Classes (main in one class, method in another)

Sample Output
    Level Up!
 */
class LevelUpSystem {
    public static void main(String[] args) {
        LevelUp l = new LevelUp();
        l.check();
    }
}
class LevelUp {
    int currentXP = 100;
    int bonusXP = 10;

    void check() {
        int totalXP = currentXP+bonusXP;

        if (totalXP >= 105) {
            System.out.println("Level Up!");
        }
        else {
            System.out.println("Keep Going!");
        }
    }
}