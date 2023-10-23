import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ps24 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            double n = Integer.parseInt(br.readLine());
            double result = n * (n - 1) / 2;

//            for (int i = 1; i <= n - 1; i++) {
//                for (int j = i + 1; j <= n; j++) {
//                    cnt++;
//                }
//            }
            String fomattedResult = String.format("%.0f", result);

            System.out.println(fomattedResult);
            System.out.println(2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}