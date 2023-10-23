import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ps37 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] input1 = br.readLine().split(" ");
            String[] input2 = br.readLine().split(" ");

            int N = Integer.parseInt(input1[0]);
            int M = Integer.parseInt(input1[1]);
            int[] arr = new int[N];

            for(int i = 0; i < N; i++){
                arr[i] = Integer.parseInt(input2[i]);
            }

            for(int i = 0; i < M; i++){
                String[] input3 = br.readLine().split(" ");
                int sum = 0;
                int m = Integer.parseInt(input3[0]);
                int n = Integer.parseInt(input3[1]);

                for(int j = m; j <= n; j++){
                    sum+=arr[j - 1];
                }

                System.out.println(sum);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}