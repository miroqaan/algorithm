import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ps33 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] inputs = br.readLine().split(" ");
            String result = "";

            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);
            int c = Integer.parseInt(inputs[2]);
            int d = Integer.parseInt(inputs[3]);
            int e = Integer.parseInt(inputs[4]);
            int f = Integer.parseInt(inputs[5]);

            for (int x = -999; x <= 999; x++) {
                for (int y = -999; y <= 999; y++) {
                    if(a * x + b * y == c && d * x + e * y == f) {
                        result+=x;
                        result+=" ";
                        result+=y;
                        break;
                    }
                }
            }

            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}