/*
definition -> calls itself inside of itself
- needs a base condition so theres no infinite loop
 */

class SumRecursion {
    public static void main(String[] args) {
        int output = sum(5);
        System.out.println(output);
        }

    static int sum(int a) {
        //Think about the if else first theres always an if else
        if (a == 0 || a == 1) {
            return 1;
        }
        else { //always put the recursive condition in the else
            return (a + sum(a-1)); //to qualify as a recursive method the name must be repeated in the method
        }
    }
}
