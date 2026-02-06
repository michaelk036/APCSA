import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

class Data {
    public static void main(String[] args) throws IOException{
        File f = new File("data.txt"); 
        Scanner sc = new Scanner(f);
        ArrayList<Integer> scoreList = new ArrayList<>();
        ArrayList<String> nameList = new ArrayList<>();

        while (sc.hasNextLine()) {
            String name = sc.next();
            nameList.add(name);
            int score = sc.nextInt();
            scoreList.add(score);
        }
        System.out.println(scoreList);
        System.out.println(nameList);
    }
}
