import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ps7 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String matrix[][] = new String[5][15];
        StringBuilder sb = new StringBuilder("");

        int mi = 0;
        int mj = 0;

        for(String str[] : matrix){
            mj = 0;

            for(String str2 : str){
                matrix[mi][mj] = "";
                mj++;
            }
            mi++;
        }

        try {
            for(int i = 0; i < matrix.length; i++){
                String input = br.readLine();

                for(int j = 0; j < input.length(); j++){
                    matrix[i][j] = String.valueOf(input.charAt(j));
                }
            }

            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix[i].length; j++){
                    for(int k = 0; k < matrix.length; k++){
                        sb.append(matrix[k][j]);
                    }
                }

                break;
            }

            System.out.println(sb);
            br.close();
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
    }
}