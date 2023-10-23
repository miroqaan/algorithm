import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ps9 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int x = Integer.parseInt(br.readLine());
            int y = Integer.parseInt(br.readLine());

            int area = x * y;

            System.out.println(area);
            br.close();
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
    }
}