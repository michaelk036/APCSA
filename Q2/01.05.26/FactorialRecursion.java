// 1.Write a recursive method to compute factorial.
class FactorialRecursion {
    public static void main(String[] args) {
        int output = factorial(5);
        System.out.println(output);
        }

    static int factorial(int a) {
        if (a == 0 || a == 1) { //basically the stopping condition
            return 1;
        }
        else {
            return (a * factorial(a-1));
        }
    }
}