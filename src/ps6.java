import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ps6 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] input = null;
            int max = -1;

            int x = 0;
            int y = 0;
            for(int i = 0; i < 9; i++){
                input = br.readLine().split(" ");

                for(int j = 0; j < 9; j++){
                    int int_input = Integer.parseInt(input[j]);
                    if(max < int_input){
                        max = int_input;
                        x = i + 1;
                        y = j + 1;
                    }
                }
            }

            System.out.println(max);
            System.out.println(x + " " + y);
            br.close();
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
    }
}