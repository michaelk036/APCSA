//Q1. Count how many lines are in a file
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class LineCount {
    public static void main(String[] args) throws IOException{
        File f = new File("LineCount.txt"); 
        Scanner sc = new Scanner(f);

        int lines = 0;

        while (sc.hasNextLine()) {
            String line = sc.nextLine(); //you don't neccesarilly need the variable, you just do `sc.nextLine();`
            lines++;
        }
        System.out.println("The file has " +lines+ " lines");
    }
}