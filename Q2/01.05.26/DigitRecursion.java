//2. Write a recursive method that counts how many digits are in a positive integer.
class DigitRecursion {
    public static void main(String[] args) {
        int output = digit(1286);
        System.out.println(output);
    }
    static int digit(int a) {
        if (a == 0) {//stopping condition
            return 0;
        }
        else {          
            int b = 1 + digit(a/10);
            return b;
        }
    }
}
