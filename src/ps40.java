import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ps40 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] input1 = br.readLine().split(" ");
            String[] input2 = br.readLine().split(" ");

            int N = Integer.parseInt(input1[0]);
            int M = Integer.parseInt(input1[1]);
            int[] arr = new int[N];
            long[] sumArr = new long[N];
            int cnt = 0;

            for(int i = 0; i < N; i++){
                arr[i] = Integer.parseInt(input2[i]);
            }

            sumArr = recursiveNumSum(arr, 0, sumArr, 0);

            for(int i = 0; i < N; i++){
                for(int j = i; j < N; j++){
                    long intervalSum = (i == 0) ? sumArr[j] : sumArr[j] - sumArr[i - 1];
                    if(intervalSum % M == 0) cnt++;

//                    int start = i;
//                    int end = j - 1;
//
//                    if(start > end){
//                        intervalSum = calculateIntervalSums(start, end, sumArr);
//
//                        if(intervalSum % M == 0) {
//                            cnt++;
//                        }
//                    }
                }
            }

            System.out.println(cnt);
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

//    private static long calculateIntervalSums(int start, int end, long[] sumArr){
//        long sumOfRange;
//
//        if(end != -1){
//            sumOfRange = sumArr[start] - sumArr[end];
//        }else{
//            sumOfRange = sumArr[start];
//        }
//
//        return sumOfRange;
//    }
}