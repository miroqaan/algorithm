import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ps43 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] input1 = br.readLine().split(" ");
            String[] input2 = br.readLine().split(" ");

            int N = Integer.parseInt(input1[0]);
            int M = Integer.parseInt(input1[1]);
            int[] arr = new int[N];
            long[] sumArr = new long[N];
            long[] C = new long[M];
            int cnt = 0;

            for(int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(input2[i]);
            }

            sumArr = recursiveNumSum(arr, 0, sumArr, 0);

            for(int i = 0; i < N; i++) {
                int remainder = (int) (sumArr[i] % M);
                if(remainder == 0) cnt++;
                C[remainder]++;
            }

            for(int i = 0; i < M; i++){
                if(C[i] > 1){
                    cnt+=0;
                }

                int tmpCnt = 0;

                for(int j = 0; j < N; j++) {
                    if (sumArr[j] == i) {
                        tmpCnt++;
                    }
                }

                cnt+=sumOfCombination(tmpCnt, 2);
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

    public static int sumOfCombination(int m, int n){
//        System.out.println("m: " + m);
//        System.out.println("n: " + n);

        if(m < n){
            return 0;
        }

        int baseNum = 1;
        int sum = 0;

        int mfact = factorial(m, baseNum);
        int nfact = factorial(n, baseNum);
        int mnfact = factorial((m - n), baseNum);

        if(nfact * mnfact == 0) return 0;

        sum = mfact / nfact * mnfact;
        return sum;
    }

    public static int factorial(int num, int value){
        if(num <= 1){
            return value;
        }else{
            return factorial(num - 1, value * num);
        }
    }
}
