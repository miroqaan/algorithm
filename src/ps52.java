import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ps52 {
    static boolean[] prime = new boolean[10000];

    public static void main(String[] args) throws Exception {
        // 소수 판별 배열 초기화
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for (int i = 2; i < Math.sqrt(prime.length); i++) {
            if (prime[i]) {
                for (int j = i * i; j < prime.length; j += i) {
                    prime[j] = false;
                }
            }
        }

        bfs(1033, 8179);
    }

    public static void bfs(int start, int end) {
        int count = -1;

        boolean visited[] = new boolean[10000];

        Queue<int[]> qu = new LinkedList<int[]>();
        qu.add(new int[]{start, 0});

        while (!qu.isEmpty()) {
            int num = qu.peek()[0];
            int cnt = qu.peek()[1];

            qu.poll();
            if (num == end) {
                if (count == -1 || count > cnt) {
                    count = cnt;
                    continue;
                }
            }

            if (num < 1000 || visited[num])
                continue;

            visited[num] = true;

            for (int i = 1; i <= 4; i++) {
                for (int j = 0; j < 10; j++) {
                    int temp = changeNum(num, i, j);
                    if (temp >= 1000 && prime[temp]) {
                        qu.offer(new int[]{temp, cnt + 1});
                    }
                }
            }
        }

        if (count == -1)
            System.out.println("Impossible");
        else
            System.out.println(count);
    }

    public static int changeNum(int num, int index, int digit) {
        char[] numArr = String.valueOf(num).toCharArray();
        numArr[index - 1] = Character.forDigit(digit, 10);
        return Integer.parseInt(new String(numArr));
    }
}