import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ps5 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = -1;

        try {
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);


            int matrix1[][] = new int[N][M];
            int matrix2[][] = new int[N][M];
            int matrix3[][] = new int[N][M];

            for(int i = 0; i < N; i++){
                String[] element = br.readLine().split(" ");

                for(int j = 0; j < M; j++){
                    matrix1[i][j] = Integer.parseInt(element[j]);
                }
            }

            for(int i = 0; i < N; i++){
                String[] element = br.readLine().split(" ");

                for(int j = 0; j < M; j++){
                    matrix2[i][j] = Integer.parseInt(element[j]);
                }
            }

            for(int i = 0; i < N; i++){
                for(int j = 0; j < M; j++){
                    matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

            for(int i = 0; i < N; i++){
                for(int j = 0; j < M; j++){
                    System.out.print(matrix3[i][j]);
                    System.out.print(" ");
                }

                System.out.println();
            }

            br.close();
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
    }
}