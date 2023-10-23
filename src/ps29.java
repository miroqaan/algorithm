import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ps29 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] input = br.readLine().split(" ");
            String[] input2 = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
            List<Integer> cards = new ArrayList<>();
            int card1 = 0;
            int card2 = 0;
            int card3 = 0;
            int max = 0;
            int sum = 0;

            for (String str : input2) {
                cards.add(Integer.parseInt(str));
            }

            for (int i = 0; i < N; i++) {
                card1 = cards.get(i);
                for (int j = 0; j < N; j++) {
                    if (i == j) continue;
                    card2 = cards.get(j);
                    for (int k = 0; k < N; k++) {
                        if (i == k || j == k) continue;
                        card3 = cards.get(k);
                        sum = card1 + card2 + card3;
                        if (sum <= M && max < sum) {
                            max = sum;
                        }
                    }
                }
            }

            System.out.println(max);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}