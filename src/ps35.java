import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ps35 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            int result = endCount(N);

            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int endCount(int N){
        int count = 0;
        int index = 0;

        while(count < N){
            index++;
            if(String.valueOf(index).contains("666")) count++;
        }

        return index;
    }
}