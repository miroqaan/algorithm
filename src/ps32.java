import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ps32 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            int decompositionSum = 0;
            int result = 0;
            for (int i = 1; i <= N; i++) {
                decompositionSum = calculateDecompositionSum(i);

                if (decompositionSum == N) {
                    result = i;
                    break;
                }
            }

            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int calculateDecompositionSum(int num) {
        int decompositionSum = 0;
        decompositionSum += num;

        String numToStr = String.valueOf(num);
        int numLength = numToStr.length();
        decompositionSum += recursiveOfDigits(num, numLength, 0);

        return decompositionSum;
    }

    private static int recursiveOfDigits(int digits, int length, int sum) {
        final int MULTIPLICATION_FACTOR = (int) Math.pow(10, length - 1);

        if (length == 0) {
            return sum;
        } else {
            sum += digits / MULTIPLICATION_FACTOR;
            return recursiveOfDigits(digits - ((digits / MULTIPLICATION_FACTOR) * MULTIPLICATION_FACTOR), length - 1, sum);
        }
    }
}