import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ps50 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            String[] inputs = br.readLine().split(" ");
            long[] nums = new long[N];
            Set<Long> sums = new HashSet<>();
            long num1;
            long num2;
            long sum;
            int cnt = 0;

            for(int i = 0; i < inputs.length; i++){
                nums[i] = Long.parseLong(inputs[i]);
            }

            for(int i = 0; i < N; i++){
                num1 = nums[i];

                for(int j = 0; j < N; j++){
                    num2 = nums[j];
                    sum = num1 + num2;

                    if(j >= i){
                        break;
                    }else{
                        System.out.println("i: " + i);
                        System.out.println("j: " + j);
                        System.out.println();

                        sums.add(sum);
                    }
                }
            }

            for(long num : nums){
                System.out.println(num);
                if(sums.contains(num)) cnt++;
            }

            System.out.println(cnt);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}