import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ps27 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            long n = Long.parseLong(br.readLine());
            long result = 0;

            if(n > 2){
                result = n * (n - 1) * (n - 2) / 6;
            }else{
                result = 0;
            }

            System.out.println(result);
            System.out.println(3);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}