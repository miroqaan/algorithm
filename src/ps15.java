import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ps15 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int cnt = 3;
            List<Integer> list = new ArrayList<>();
            String result = "";

            for(int i = 0; i < cnt; i++){
                list.add(Integer.parseInt(br.readLine()));
            }

            result = determineAngleType(list);

            System.out.println(result);
            br.close();
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
    }

    private static String determineAngleType(List<Integer> degrees){
        int degree1 = -1;
        int degree2 = -1;
        int degree3 = -1;

        int sum = -1;
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();

        String result = "";

        degree1 = degrees.get(0);
        degree2 = degrees.get(1);
        degree3 = degrees.get(2);

        sum = degree1 + degree2 + degree3;

        if(sum != 180){
            result = "Error";
            return result;
        }

        map.put(degree1, map.getOrDefault(degree1, 0) + 1);
        map.put(degree2, map.getOrDefault(degree2, 0) + 1);
        map.put(degree3, map.getOrDefault(degree3, 0) + 1);

        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            if(max < entry.getValue()) max = entry.getValue();
        }

        if(max == 3) result = "Equilateral";
        if(max == 2) result = "Isosceles";
        if(max == 1) result = "Scalene";

        return result;
    }
}