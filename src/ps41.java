import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ps41 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] input1 = br.readLine().split(" ");
            String[] input2 = br.readLine().split(" ");

            int N = Integer.parseInt(input1[0]);
            int M = Integer.parseInt(input1[1]);
            int[] arr = new int[N];
            HashMap<Long, Integer> remainderCount = new HashMap<>();
            long prefixSum = 0;
            int cnt = 0;

            for(int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(input2[i]);
                prefixSum += arr[i];
                long remainder = (prefixSum % M + M) % M;
                remainderCount.put(remainder, remainderCount.getOrDefault(remainder, 0) + 1);
                if (remainder == 0) {
                    cnt++;
                }
            }

            for (long key : remainderCount.keySet()) {
                long count = remainderCount.get(key);
                cnt += count * (count - 1) / 2;
            }

            System.out.println(cnt);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
