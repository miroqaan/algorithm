import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ps12 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int cnt = 3;
            int[][] matrix = new int[cnt][2];

            for(int i = 0; i < cnt; i++){
                String[] input = br.readLine().split(" ");
                matrix[i][0] = Integer.parseInt(input[0]);
                matrix[i][1] = Integer.parseInt(input[1]);
            }

            Map<Integer, Integer> mapX = countOccurrences(matrix, 0);
            Map<Integer, Integer> mapY = countOccurrences(matrix, 1);

            int resultX = findSingleOccurrence(mapX);
            int resultY = findSingleOccurrence(mapY);

            System.out.println(resultX + " " + resultY);
            br.close();
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
    }

    private static Map<Integer, Integer> countOccurrences(int[][] matrix, int columnIndex){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < matrix.length; i++){
            int value = matrix[i][columnIndex];
            map.put(value, map.getOrDefault(value, 0) + 1);
        }
        return map;
    }

    private static int findSingleOccurrence(Map<Integer, Integer> map){
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            if(entry.getValue() < 2){
                return entry.getKey();
            }
        }
        return -1;
    }
}