import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ps48 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            long cnt = 1;

            int start_index = 1;
            int end_index = 1;
            int sum;

            while(end_index < N){
                sum = (end_index + start_index) * (end_index - start_index + 1) / 2;
                if(N == sum) {
                    cnt++;
                    end_index++;
                }else if(N > sum){
                    end_index++;
                }else{
                    start_index++;
                }
            }

            System.out.println(cnt);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
