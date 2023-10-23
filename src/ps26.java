import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ps26 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            long n = Long.parseLong(br.readLine());
//            long result = n - 2 +  (n - 1) * (n - 2);
            int cnt1 = 0;
            int cnt2 = 0;
            int cnt3 = 0;
            int total = 0;

            for(int i = 1; i <= n - 2; i++){
                System.out.print("i");
                cnt1++;
                for(int j = i + 1; j <= n - 1; j++){
                    System.out.print("j");
                    cnt2++;
                    for(int k = j + 1; k <= n; k++){
                        System.out.print("k");
                        cnt3++;
                    }
                }
            }

            System.out.println("");
            System.out.println(cnt3);
//            System.out.println(result);
            System.out.println(3);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}