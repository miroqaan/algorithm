import java.util.LinkedList;
import java.util.List;

public class ps53 {
    static boolean[] visited;
    static List<Integer>[] adj;

    public static void main(String[] args) throws Exception {
        int n = 5; // 노드의 개수
        visited = new boolean[n + 1];
        adj = new LinkedList[n + 1];
        for (int i = 0; i <= n; i++) {
            adj[i] = new LinkedList<>();
        }

        dfs(1);
    }

    public static void dfs(int u) {
        visited[u] = true;
        for (int v : adj[u]) {
            if (!visited[v]) dfs(v);
        }
    }
}