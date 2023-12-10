import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class baekjoon_1874 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        ArrayList<String> result = new ArrayList<>();
        int current = 1;

        for (int num : sequence) {
            while (current <= num) {
                stack.push(current);
                result.add("+");
                current++;
            }
            if (stack.peek() == num) {
                stack.pop();
                result.add("-");
            } else {
                System.out.println("NO");
                return;
            }
        }

        for (String op : result) {
            System.out.println(op);
        }
    }
}