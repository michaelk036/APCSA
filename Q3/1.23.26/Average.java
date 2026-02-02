/*
Write a program that:
1. Reads all the scores from the file
2. Prints the average score 
3. Prints how many students passed (score>35)
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Average {
    public static void main(String[] args) throws IOException{
        File f = new File("average.txt"); 
        Scanner sc = new Scanner(f);

        double scores = 0;
        int good = 0;
        int studentCount = 0;

        while (sc.hasNextLine()) {
            int score = sc.nextInt();
            scores += score;
            if (score > 35) {
                good++;
            }
            studentCount++;
        }

        System.out.println("Average: " +scores/studentCount);
        System.out.println("Students that scored above 35: " +good);
    }
}
// Andy was here 