import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

class Names {
    public static void main(String[] args) throws IOException {
        File f = new File("names.txt"); 
        Scanner sc = new Scanner(f);
        ArrayList<String> list = new ArrayList<>();

        while (sc.hasNextLine()) {
            String name = sc.next();
            list.add(name);
        }
        System.out.println(list);
    }
}