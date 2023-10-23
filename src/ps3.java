import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class s3 {
    int soultion1(int n) {
        int cnt = 0;

        int multiply3 = n;
        int numberTimesMultiplied = 0;
        while(multiply3 < n){
            multiply3*=3;
            numberTimesMultiplied++;
        }



        while(n > 1){
            if (n % 3 == 0) {
                n = n / 3;
                cnt++;
                System.out.println("case 1: " + n);
            } else if (n % 2 == 0) {
                n = n / 2;
                cnt++;
                System.out.println("case 2: " + n);
            } else {
                n = n - 1;
                cnt++;
                System.out.println("case 3: " + n);
            }
        }

        return cnt;
    }
}

public class ps3 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s3 s = new s3();
        int result = -1;

        try {
            int n = Integer.parseInt(br.readLine());
            result = s.soultion1(n);

            System.out.println(result);
            br.close();
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
    }
}