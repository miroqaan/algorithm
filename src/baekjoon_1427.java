import java.io.BufferedReader;
import java.io.InputStreamReader;

public class baekjoon_1427 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int[] arr = new int[input.length()];

        for (int i = 0; i < input.length(); i++) {
            arr[i] = Character.getNumericValue(input.charAt(i));
        }

        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i);
        }
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = temp;
        }
    }
}