import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ps18 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            while(true){
                List<Integer> lengths = new ArrayList<>();
                String[] inputs = br.readLine().split(" ");

                for (int i = 0; i < inputs.length; i++) {
                    lengths.add(Integer.parseInt(inputs[i]));
                }

                String result = determineLengthType(lengths);

                if("End".equals(result)) break;

                System.out.println(result);
            }

            br.close();
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
    }

    private static String determineLengthType(List<Integer> lengths) {
        int sum = lengths.stream().mapToInt(Integer::intValue).sum();
        if(sum == 0) return "End";

        Map<Integer, Integer> lengthFrequency = new HashMap<>();
        for (int length : lengths) {
            lengthFrequency.put(length, lengthFrequency.getOrDefault(length, 0) + 1);
        }

        int maxFrequency = Collections.max(lengthFrequency.values());
        int maxLength = Collections.max(lengthFrequency.keySet());

        if(maxLength * 2 >= sum){
            return "Invalid";
        }else if (maxFrequency == 3) {
            return "Equilateral";
        } else if (maxFrequency == 2) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
}