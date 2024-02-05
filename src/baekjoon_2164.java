import java.util.*;

// 카드 게임
public class baekjoon_2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> myQueue = new LinkedList<>();
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++){       // 카드 큐에 저장
            myQueue.add(i);
        }
        while(myQueue.size() > 1){          // 카드가 1장 남을 때까지
            myQueue.poll();                 // 맨 위 카드를 버림
            myQueue.add(myQueue.poll());    // 맨 위의 카드를 가장 아래 카드 밑으로 이동
        }
        System.out.println(myQueue.poll()); // 마지막으로 남은 카드 출력
    }
}