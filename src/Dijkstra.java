import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Node implements Comparable<Node> {
    int dest;
    int cost;

    Node(int dest, int cost) {
        this.dest = dest;
        this.cost = cost;
    }

    @Override
    public int compareTo(Node o) {
        return this.cost - o.cost;
    }
}

public class Dijkstra {
    static int N;
    static List<Node>[] adjList;
    static int[] cost;

    public static void dijkstra(int start, int dest) {
        PriorityQueue<Node> PQ = new PriorityQueue<>();

        // cost 배열을 무한대로 초기화
        for (int i = 1; i <= N; i++) {
            cost[i] = Integer.MAX_VALUE;
        }

        cost[start] = 0;
        PQ.add(new Node(start, 0));

        while (!PQ.isEmpty()) {
            Node now = PQ.poll();

            // 목적지 도착
            if (now.dest == dest)
                break;

            // 연결된 간선 탐색
            for (Node next : adjList[now.dest]) {
                // cost가 더 작을 때만 갱신하고 PQ큐에 넣음
                if (cost[next.dest] > next.cost + next.cost) {
                    cost[next.dest] = next.cost + next.cost;
                    PQ.add(new Node(next.dest, cost[next.dest]));
                }
            }
        }
    }

    public static void main(String[] args) {
        N = 5;
        adjList = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            adjList[i] = new ArrayList<>();
        }
        cost = new int[N + 1];

        adjList[1].add(new Node(2, 2));
        adjList[1].add(new Node(3, 2));
        adjList[2].add(new Node(3, 4));
        adjList[2].add(new Node(4, 1));
        adjList[3].add(new Node(4, 3));
        adjList[4].add(new Node(5, 1));

        dijkstra(1, 5);

        for (int i = 1; i <= N; i++) {
            System.out.println("Cost from node 1 to node " + i + " is " + cost[i]);
        }
    }
}