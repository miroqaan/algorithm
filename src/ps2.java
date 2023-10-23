import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class s2 {
    void soultion1(int num) {
        for(int i = 0; i < num; i++){
            System.out.println("무야호~~!");
        }
    }
}
public class ps2 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s2 s = new s2();

        try {
            int n = Integer.parseInt(br.readLine());
            s.soultion1(n);

            br.close();
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
    }
}