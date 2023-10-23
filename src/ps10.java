import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ps10 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] input = br.readLine().split(" ");

            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            int w = Integer.parseInt(input[2]);
            int h = Integer.parseInt(input[3]);

            int minDistance = Integer.MAX_VALUE;

            int wx = w - x;
            int hy = h - y;

            if(minDistance > wx) minDistance = wx;
            if(minDistance > hy) minDistance = hy;
            if(minDistance > x) minDistance = x;
            if(minDistance > y) minDistance = y;

            System.out.println(minDistance);
            br.close();
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
    }
}