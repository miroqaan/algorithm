import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ps28 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] input = br.readLine().split(" ");
            String input2 = br.readLine();
            String input3 = br.readLine();
            int result = 0;

            int a1 = Integer.parseInt(input[0]);
            int a2 = Integer.parseInt(input[1]);
            int c = Integer.parseInt(input2);
            int n0 = Integer.parseInt(input3);

            int subtraction = 0;
            int subtraction2 = 0;

            if(a1 * n0 + a2 <= n0 * c){
                subtraction = (n0 * c) - (a1 * n0 + a2);
                subtraction2 = ((n0 + 1) * c) - (a1 * (n0 + 1) + a2);
                if(subtraction2 - subtraction >= 0){
                    result = 1;
                }
            };

            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}