import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ps19 {
    private static final int END_SIGNAL = 0;
    private static final int INVALID_THRESHOLD = 2;

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                List<Integer> lengths = parseInput(br.readLine());

                if (lengths.stream().mapToInt(Integer::intValue).sum() == END_SIGNAL) {
                    break;
                }

                String result = determineLengthType(lengths);
                System.out.println(result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Integer> parseInput(String inputLine) {
        String[] inputs = inputLine.split(" ");
        List<Integer> lengths = new ArrayList<>();
        for (String input : inputs) {
            lengths.add(Integer.parseInt(input));
        }
        return lengths;
    }

    private static String determineLengthType(List<Integer> lengths) {
        int sum = lengths.stream().mapToInt(Integer::intValue).sum();

        if (sum == END_SIGNAL) {
            return "End";
        }

        Map<Integer, Integer> lengthFrequency = new HashMap<>();
        lengths.forEach(length -> lengthFrequency.put(length, lengthFrequency.getOrDefault(length, 0) + 1));

        int maxFrequency = Collections.max(lengthFrequency.values());
        int maxLength = Collections.max(lengthFrequency.keySet());

        if (maxLength * INVALID_THRESHOLD >= sum) {
            return "Invalid";
        } else if (maxFrequency == 3) {
            return "Equilateral";
        } else if (maxFrequency == 2) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
}