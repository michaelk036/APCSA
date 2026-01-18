//3. Write a recursive method that returns the sum of all elements in an array.
class ArrayRecursion {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 238};
        int output = sum(nums);
        System.out.println(output);
    }

    static int sum(int[] array) {
        if (array.length == 0) { // stopping condition
            return 0;
        } 
        else {
            return array[array.length - 1] + sum(array, n - 1);
        }
    }
}
