import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ps47 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] input1 = br.readLine().split(" ");
            String[] input2 = br.readLine().split(" ");

            int N = Integer.parseInt(input1[0]);
            int M = Integer.parseInt(input1[1]);
            int[] arr = new int[N];
            long[] sumArr = new long[N];
            long[] C = new long[M];
            long answer = 0;

            for(int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(input2[i]);
            }

            sumArr = recursiveNumSum(arr, 0, sumArr, 0);

            for(int i = 0; i < N; i++) {
                int remainder = (int)(sumArr[i] % M);
                if(remainder == 0) answer++;
                C[remainder]++;
            }

            for(int i = 0; i < M; i++){
                if(C[i] > 1){
                    answer = answer + (C[i] * (C[i] - 1) / 2);
                }
            }

            System.out.println(answer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static long[] recursiveNumSum(int arr[], long sum, long[] sumArr, int index){
        sum += arr[index];
        sumArr[index] = sum;
        index++;

        if(index >= arr.length){
            return sumArr;
        }else{
            return recursiveNumSum(arr, sum, sumArr, index);
        }
    }
}
