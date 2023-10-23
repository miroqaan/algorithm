import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ps13 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            long n = Long.parseLong(br.readLine());

            System.out.println(n * 4);
            br.close();
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
    }
}