//Q2. Print only lines longer than 5 characters
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class BigLine {
    public static void main(String[] args) throws IOException{
        File f = new File("BigLine.txt"); 
        Scanner sc = new Scanner(f);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();

            if (line.length() > 5) {
                System.out.println(line);
            }
        }
    }
}
