import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Topology_Sort {
    static final int MAX = 101;

    static int[] visited = new int[MAX];
    static int[] inputEdgeCount = new int[MAX];
    static ArrayList<Integer> ordered = new ArrayList<>();
    static ArrayList<Integer>[] adj = new ArrayList[MAX];

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < MAX; i++) {
            adj[i] = new ArrayList<>();
        }

        // String testInput = "5 7\n1 2\n1 4\n1 3\n2 5\n3 4\n4 2\n4 5\n";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            adj[s].add(e);
            inputEdgeCount[e]++;
        }

        ArrayList<Integer> result = topologicalSort(N);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i) + " ");
        }

        System.out.println();
    }

    private static ArrayList<Integer> topologicalSort(int N) {
        ArrayList<Integer> startNode = new ArrayList<>();
        ordered.clear();
        Arrays.fill(visited, 0);

        for (int i = 1; i <= N; i++) {
            if (inputEdgeCount[i] == 0) {
                startNode.add(i);
            }
        }

        for (int i : startNode) {
            if (visited[i] == 0)
                dfs(i);
        }

        Collections.reverse(ordered);
        return ordered;
    }

    static void dfs(int u) {
        visited[u] = 1;
        for (int v : adj[u]) {
            if (visited[v] == 0)
                dfs(v);
        }

        ordered.add(u);
    }
}