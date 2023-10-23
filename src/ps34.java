import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ps34 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] inputs = br.readLine().split(" ");
            int N = Integer.parseInt(inputs[0]);
            int M = Integer.parseInt(inputs[1]);

            String matrix[][] = new String[N][M];
            String blocks[][];
            int squareCount = Integer.MAX_VALUE;
            int result;

            for(int i = 0; i < N; i++){
                String inputLine = br.readLine();

                for(int j = 0; j < M; j++){
                    matrix[i][j] = inputLine.substring(j, j + 1);
                }
            }

            for(int i = 0; i < N - 7; i++){
                for(int j = 0; j < M - 7; j++){
                    blocks = fillMatrix(matrix, i, j);
                    int tmpCnt = countOfWbBlocks(blocks);

                    if(squareCount > tmpCnt){
                        squareCount = tmpCnt;
                    }
                }
            }

            result = squareCount;
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String[][] fillMatrix(String[][] partOfMatrix, int x, int y){
        String blocks[][] = new String[8][8];

        for(int i = x; i < x + 8; i++){
            for(int j = y; j < y + 8; j++){
                blocks[i - x][j - y] = partOfMatrix[i][j];
            }
        }

        return blocks;
    }

    private static int countOfWbBlocks(String[][] blocks){
        int count = Integer.MAX_VALUE;

        String block1;
        String block2;

        for(int v_case = 0; v_case <= 1; v_case++){
            int tmpCount = 0;

            if(v_case == 0){
                block1 = "B";
                block2 = "W";
            }else{
                block1 = "W";
                block2 = "B";
            }

            for(int i = 0; i < 8; i++){
                for(int j = 0; j < 8; j++){
                    if(i % 2 == 0 && j % 2 == 0 && !block1.equals(blocks[i][j])){
                        tmpCount++;
                    }else if(i % 2 == 1 && j % 2 == 0 && !block2.equals(blocks[i][j])){
                        tmpCount++;
                    }else if(i % 2 == 0 && j % 2 == 1 && !block2.equals(blocks[i][j])){
                        tmpCount++;
                    }else if(i % 2 == 1 && j % 2 == 1 && !block1.equals(blocks[i][j])){
                        tmpCount++;
                    }
                }
            }

            if(count > tmpCount){
                count = tmpCount;
            }
        }

        return count;
    }
}