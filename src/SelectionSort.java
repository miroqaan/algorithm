public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 4, 9, 1, 6, 2, 7};
        selectionSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}