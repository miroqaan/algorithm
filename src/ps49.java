import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ps49 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            int M = Integer.parseInt(br.readLine());
            String[] inputs = br.readLine().split(" ");
            int[] nums = new int[N];
            int sum;
            int cnt = 0;
            int num1;
            int num2;

            for(int i = 0; i < inputs.length; i++){
                nums[i] = Integer.parseInt(inputs[i]);
            }

            for(int i = 0; i < N; i++){
                num1 = nums[i];

                for(int j = 0; j < N; j++){
                    num2 = nums[j];
                    sum = num1 + num2;

                    if(j >= i){
                        break;
                    }else if(sum == M){
                        cnt++;
                    }else if(sum > M){
                        continue;
                    }
                }
            }

            System.out.println(cnt);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}