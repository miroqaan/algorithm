import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ps20 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            List<Integer> lengths = parseInput(br.readLine());

            int result = largestTrianglePerimeter(lengths);
            System.out.println(result);
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

    private static int largestTrianglePerimeter(List<Integer> lengths) {
        int sum = lengths.stream().mapToInt(Integer::intValue).sum();
        List<Integer> maxLengths = new ArrayList<>();
        int result = 0;

        lengths.forEach(length -> maxLengths.add(length));
        int maxLength = Collections.max(maxLengths);

        if (maxLength * 2 >= sum) {
            result = calculateLargestPerimeter(sum - maxLength);
        } else {
            result = sum;
        }

        return result;
    }

    private static int calculateLargestPerimeter(int sumOfSides) {
        return (sumOfSides * 2) - 1;
    }
}