public class BetterMergeSort {
    public static void main(String[] args) {
        int array[] = {12, 8, 9, 3, 11, 5};
        sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void sort (int array[]) {
        int len = array.length;

        if (len <= 1) { //base case
            return;
        }

        else {
            int mid = len/2; 
            int left[] = new int[mid];
            int right[] = new int[len - mid]; //done in case the given array is odd

            for (int i = 0; i <= mid; i++) {
                left[i] = array[i]; 
            }
            
            for (int i = mid; i <= len; i++) {
                right[i] = array[i];
            }

            sort(left);
            sort(right);
            
            merge(array, left, right);
        }
    }
    public static void merge(int array[], int left[], int right[]) {
        int leftSide = array.length/2;
        int rightSide = array.length - leftSide;

        int l = 0; int r = 0;
        while(l < leftSide && r < rightSide) { //while loop because we don't know how many iterations it takes
            if (left[l] < right[r]) {
                array[l] = left[l];
            }
        }
    }
    
}
