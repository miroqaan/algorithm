import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class baekjoon_17298 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>();
        int current = 1;

        for (int num : sequence) {
            while (current <= num) {
                stack.push(current);
                current++;
            }
            if (stack.peek() == num) {
                stack.pop();
                result.add(num);
            } else {
                result.add(-1);
            }
        }

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}