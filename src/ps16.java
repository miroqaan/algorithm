import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ps16 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int cnt = 3;
            List<Integer> angles = new ArrayList<>();

            for (int i = 0; i < cnt; i++) {
                angles.add(Integer.parseInt(br.readLine()));
            }

            String result = determineTriangleType(angles);

            System.out.println(result);
            br.close();
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
    }

    private static String determineTriangleType(List<Integer> angles) {
        int sum = angles.stream().mapToInt(Integer::intValue).sum();

        if (sum != 180) {
            return "Error";
        }

        Map<Integer, Integer> angleFrequency = new HashMap<>();
        for (int angle : angles) {
            angleFrequency.put(angle, angleFrequency.getOrDefault(angle, 0) + 1);
        }

        int maxFrequency = Collections.max(angleFrequency.values());

        if (maxFrequency == 3) {
            return "Equilateral";
        } else if (maxFrequency == 2) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
}