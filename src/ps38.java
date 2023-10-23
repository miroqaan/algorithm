import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ps38 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] input1 = br.readLine().split(" ");
            String[] input2 = br.readLine().split(" ");

            int N = Integer.parseInt(input1[0]);
            int M = Integer.parseInt(input1[1]);
            int[] arr = new int[N];
            long[] numSum = new long[N];

            for(int i = 0; i < N; i++){
                arr[i] = Integer.parseInt(input2[N - i - 1]);
            }

            numSum = recursiveNumSum(arr, 0, numSum, 0);
            for(int i = 0; i < M; i++){
                String[] elements = br.readLine().split(" ");
                long sumOfRange;
                int ele1 = N - Integer.parseInt(elements[0]);
                int ele2 = N - Integer.parseInt(elements[1]) - 1;

                if(ele2 != -1){
                    sumOfRange = numSum[ele1] - numSum[ele2];
                }else{
                    sumOfRange = numSum[ele1];
                }

                System.out.println(sumOfRange);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static long[] recursiveNumSum(int arr[], long sum, long[] numSum, int index){
        sum += arr[index];
        numSum[index] = sum;
        index++;

        if(index >= arr.length){
            return numSum;
        }else{
            return recursiveNumSum(arr, sum, numSum, index);
        }
    }
}