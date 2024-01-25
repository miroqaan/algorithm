public class BackTracking {
    private static int N;
    private static int ans;
    private static boolean[] visit;
    private static int[][] map;

    private static void backTracking(int depth, int sum) {
        if (depth == N) {
            ans = Math.max(ans, sum);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                backTracking(depth + 1, sum + map[depth][i]);
                visit[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        N = 5;
        ans = 0;
        visit = new boolean[N];
        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = 1;
            }
        }

        backTracking(0, 0);
        System.out.println(ans);
    }
}