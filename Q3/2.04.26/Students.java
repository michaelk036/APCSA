import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Students {
    public static void printPassingStudents() throws IOException {
            File f = new File("students.txt"); 
            Scanner sc = new Scanner(f);

            while (sc.hasNextLine()) {
                String name = sc.next();
                int score = sc.nextInt();

                if (score > 70) {
                    System.out.println(name);
                }
            }
        }
}