/*
Q2 — Replace Names
Write code that:
Creates an ArrayList of 5 student names
Replaces the 3rd one with "Unknown"
Prints each name using a loop
*/
import java.util.ArrayList;

class ReplaceNames {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        System.out.println(students);

        students.add("Sam");
        students.add("Ishaan");
        students.add("Michael");
        students.add("Dexter");
        students.add("Josh");
        System.out.println(students);


        students.set(3,"Unknown");
        System.out.println(students);
        
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
}