import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ps11 {
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

            Map<Integer, Integer> mapX = new HashMap<>();
            Map<Integer, Integer> mapY = new HashMap<>();

            for(int i = 0; i < cnt; i++){
                int x = matrix[i][0];
                int y = matrix[i][1];

                if(mapX.get(x) == null){
                    mapX.put(x, 1);
                }else{
                    mapX.put(x, mapX.get(x) + 1);
                }

                if(mapY.get(y) == null){
                    mapY.put(y, 1);
                }else{
                    mapY.put(y, mapY.get(y) + 1);
                }
            }

            Iterator<Map.Entry<Integer, Integer>> iterator = mapX.entrySet().iterator();
            Iterator<Map.Entry<Integer, Integer>> iterator2 = mapY.entrySet().iterator();

            int resultX = -1;
            int resultY = -1;

            while (iterator.hasNext()) {
                Map.Entry<Integer, Integer> entry = iterator.next();
                Integer key = entry.getKey();
                Integer value = entry.getValue();

                if(value < 2){
                    resultX = key;
                }

                entry = iterator2.next();
                key = entry.getKey();
                value = entry.getValue();

                if(value < 2){
                    resultY = key;
                }
            }

            System.out.println(resultX + " " + resultY);
            br.close();
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
    }
}