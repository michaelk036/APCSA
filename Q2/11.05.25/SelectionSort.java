class SelectionSort {
    public static void main(String[] args) {
        int[] array = {7, 8, 3, 1, 2};

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < array[min]) {
                    min = j;
                }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
