class InsertionSort {
    public static void main(String[] args) {
        int array[] = {103,68,5,37,275};

        for (int i = 1; i < array.length; i++) {
            int a = array[i];
            int j = i - 1;
            
            while (j >= 0 && array[j] > a) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = a;  
        }

        for (int k = 1; k <= array.length; k++) {
            System.out.println(array[k]);
        }
    }
}
