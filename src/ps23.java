import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ps23 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            int cnt = 0;
            int cnt2 = 0;

            for(int i = 1; i <= n - 1; i++){
                for(int j = i + 1; j <= n; j++){
                    cnt++;
                }
            }

//            for(int i = 0; i < n - 1; i++){
//                for(int j = i; j < n; j++){
//                    cnt2++;
//                }
//            }

            System.out.println(cnt);
            System.out.println(2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}