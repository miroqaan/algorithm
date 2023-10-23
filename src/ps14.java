import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ps14 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int cnt = Integer.parseInt(br.readLine());

            int x1 = -1;
            int x2 = -1;
            int y1 = -1;
            int y2 = -1;

            int area = -1;

            for(int i = 0; i < cnt; i++){
                String[] input = br.readLine().split(" ");

                if(i == 0){
                    x1 = Integer.parseInt(input[0]);
                    y1 = Integer.parseInt(input[1]);
                    x2 = Integer.parseInt(input[0]);
                    y2 = Integer.parseInt(input[1]);
                }else{
                    int newX = Integer.parseInt(input[0]);
                    int newY = Integer.parseInt(input[1]);

                    if(x1 > newX) x1 = newX;
                    if(y1 > newY) y1 = newY;
                    if(x2 < newX) x2 = newX;
                    if(y2 < newY) y2 = newY;
                }
            }

            area = (x2 - x1) * (y2 - y1);

            System.out.println(area);
            br.close();
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
    }
}