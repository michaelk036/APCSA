public class MergeSort {
    public static void main (String[] args) {
        int array[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        divide(array); //when the array is returned to divide(), it's already sorted
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void divide (int array[]) {
        int len = array.length;

        if (len <= 1) { //base case -> so divide() will stop when left[] and right[] are both arrays with the length of 1
            return;
        }

        int mid = len/2;
        int left[] = new int[mid];
        int right[] = new int[len-mid];

        for (int i = 0; i < mid; i++) {
            left[i] = array[i]; 
        }

        for (int i = mid; i < len; i++) {
            right[i-mid] = array[i];
        }

        divide(left);
        divide(right);
        merge(array, left, right);
    }

    public static void merge(int array[], int left[], int right[]) {
        int leftLen = array.length/2;
        int rightLen = array.length - leftLen;
        int i = 0; //index of array[]
        int l = 0; //index of left[]
        int r = 0; //index of right[]

        while (l < leftLen && r < rightLen) {
            if (left[l] < right[r]) {
                array[i] = left[l];
                i++;
                l++;
            }
            else {
                array[i] = right[r];
                i++;
                r++;
            }
        }

        //the following is for the remaining elements when one of the arrays is empty
        while (l < leftLen) {
            array[i] = left[l];
            i++;
            l++;
        }
        while (r < rightLen) {
            array[i] = right[r];
            i++;
            r++;
        }
    }
}