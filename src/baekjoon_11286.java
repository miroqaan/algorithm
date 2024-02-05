import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class baekjoon_11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 우선순위 큐 정렬 순서 설정
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);

            // compare(o1, o2)가 양수를 반환하면 o1이 o2보다 크단 걸 뜻하고 o1이 o2보다 뒤에 위치한다.
            // compare(o1, o2)가 0을 반환하면 o1와 o2는 같으며 순서가 보장되지 않는다.
            // compare(o1, o2)가 음수를 반환하면 o1이 o2보다 작단 걸 뜻하며 o1이 o2보다 앞에 위치한다.
            // 작은 게 먼저 나온다. 먼저 나오게 하고 싶은 것을 음수로 반환하면 된다.
            if (first_abs == second_abs) {
                // o1이 o2보다 크면 1을 반환한다 -> o2가 먼저 나온다.
                // o1이 o2보다 크지 않으면 -1을 반환한다 -> o1이 먼저 나온다.
                // 작은 걸 먼저 나오게 한다.
                // 오름차순이다.
                return o1 > o2 ? 1 : -1;
            } else {
                // 절댓값 중 작은 게 먼저 나온다.
                // second_abs - first_abs로 하면 큰 게 먼저 나온다.
                // 기본은 오름차순인데 second_abs - first_abs로 지정하여 o1과 o2의 순서를 바꾸면 내림차순이 된다.
                return first_abs - second_abs;
            }
        });

        for (int i = 0; i < N; i++) {
            int request = Integer.parseInt(br.readLine());
            if (request == 0) {
                if (pq.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(pq.poll());
                }
            } else {
                pq.add(request);
            }
        }
    }
}