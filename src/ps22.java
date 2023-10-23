import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ps22 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            double result = Math.pow(n, 2);
            String fomattedResult = String.format("%.0f", result);

            System.out.println(fomattedResult);
            System.out.println(2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}