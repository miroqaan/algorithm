public class Union_Find {
    static int[] parent = new int[10];

    public static void main(String[] args) {
        for (int j = 0; j < parent.length; j++) {
            parent[j] = j;
        }

        union(1, 9);
        union(3, 6);
        union(6, 7);
        union(9, 5);
        union(6, 8);

        System.out.println(find(1, 8)); // true
        System.out.println(find(1, 9)); // false
    }

    private static void union(int a, int b) {
        int x = getParent(a);
        int y = getParent(b);

        if (x > y) {
            parent[y] = parent[x];
        } else {
            parent[x] = parent[y];
        }
    }

    private static boolean find(int a, int b) {
        int x = getParent(a);
        int y = getParent(b);
        return x == y;
    }

    private static int getParent(int a) {
        if (parent[a] == a) return a;

        return parent[a] = getParent(parent[a]);
    }
}