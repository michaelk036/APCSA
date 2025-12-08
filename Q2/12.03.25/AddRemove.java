/* 
Q1 — Add & Remove

Create an ArrayList of integers and:
Add: 10, 20, 30, 40
Insert 15 at index 1
Remove the element at index 2
Print the final list
*/
import java.util.ArrayList;

class AddRemove {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); //you must use Integer class not int cause ArrayLists only take objects
        System.out.println(list);

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);

        list.add(1,15);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);
    }
}
