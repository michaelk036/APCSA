public class MergeSort {
    public static void main(String[] args) {
        int a[] = {6 , 3, 9, 5, 2, 8};

        MergeSort m = new MergeSort();
        m.sort(a);
    }
    public int[] sort(int a[]) {
        int left[];
        int right[];
        //two temporary arrays
        //merge those into the original array
        //left 0 index right index 0, 
        
        if (a.length == 1) {
            return a;
        }
        else {
            int b[] = {};

            for (int i = 0; i <= a.length/2; i++) {
                b[i] = a[i];
                b[i].sort();
            }
            return b;
        }
    }
}
