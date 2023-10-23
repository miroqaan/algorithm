import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ps25 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            long n = Long.parseLong(br.readLine());
            long result = n * n * n;

            System.out.println(result);
            System.out.println(3);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}