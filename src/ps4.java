import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class s4 {
    int minOperations(int n) {
        int[] dp = new int[n + 1];

        dp[1] = 0;

        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + 1;

            if(i % 3 == 0){
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }

            if(i % 2 == 0){
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
        }

        return dp[n];
    }
}

public class ps4 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s4 s = new s4();
        int result = -1;

        try {
            int n = Integer.parseInt(br.readLine());
            result = s.minOperations(n);

            System.out.println(result);
            br.close();
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
    }
}