import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ps8 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int canvasSize = 100;
        int canvas[][] = new int[canvasSize][canvasSize];
        int area = 0;

        try {
            int numPapers = Integer.parseInt(br.readLine());

            for (int i = 0; i < numPapers; i++) {
                String[] paper = br.readLine().split(" ");
                int x = Integer.parseInt(paper[0]);
                int y = Integer.parseInt(paper[1]);

                for (int j = y; j < y + 10; j++) {
                    for (int k = x; k < x + 10; k++) {
                        canvas[j][k] = 1;
                    }
                }
            }

            for (int i = 0; i < canvasSize; i++) {
                for (int j = 0; j < canvasSize; j++) {
                    if (canvas[i][j] == 1) {
                        area++;
                    }
                }
            }

            System.out.println(area);
            br.close();
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
    }
}