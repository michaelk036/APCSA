/*
Question 1: The Video Game Character 

Create a class called GameCharacter
- Each character has a name (String) and health (int).
- Write a default constructor that sets the name to "Unknown" and health to 100
- Write a parameterized constructor that takes a name and health as arguments.
- Write a method takeDamage(int damage) that reduces health. If health goes below 0, set it to 0.
- Write a method printStatus) that prints the character's name and health.

In the main method:
1 Create one character using the default constructor.
2. Create another character using the parameterized constructor.
3. Call takeDamage) and print their status:
 */

class GameChar {
    public static void main(String[] args) {
        GameCharacter g = new GameCharacter();
        g.takeDamage();
        g.printStatus();

        GameCharacter g1 = new GameCharacter("Michael",250);
        g1.takeDamage();
        g1.printStatus();


    }
}

class GameCharacter {
    String name;
    int health;

    GameCharacter() {
        name  = "Unknown";
        health = 100;
    }

    GameCharacter(String playerName, int playerHealth) {
        name = playerName;
        health = playerHealth;
    }

    void takeDamage() {//call with val
        int damage = 0;
        health -= damage;

        if (health <= 0) {
            health = 0;
        }
    }

    void printStatus() {
        System.out.println(name+ "'s health is " +health);
    }
}