import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// K번째 수
// pivot을 정하는 방법
// pivot == K: K번째 수를 찾는 것이기에 알고리즘을 종료한다.
// pivot > K: pivot의 왼쪽 부분에 K가 있으므로 왼쪽(S ~ pivot -1)만 정렬을 수행한다.
// pivot < K: pivot의 오른쪽 부분에 K가 있으므로 오른쪽(pivot + 1 ~ E)만 정렬을 수행한다.
public class P11004 {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(in.readLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        quickSort(A, 0, N - 1, K - 1);
        System.out.println(A[K - 1]);
    }

    public static void quickSort(int[] A, int S, int E, int K) {
        if (S < E) {
            int pivot = partition(A, S, E);
            if (pivot == K) return;                 // K번째 수가 pivot이면 더이상 구할 필요 없음
            else if (K < pivot)                     // K가 pivot보다 작으면 왼쪽 그룹만 정렬 수행
                quickSort(A, S, pivot - 1, K);
            else                                    // K가 pivot보다 크면 오른쪽 그룹만 정렬 수행
                quickSort(A, pivot + 1, E, K);
        }
    }

    public static int partition(int[] A, int S, int E) {
        if (S + 1 == E) {
            if (A[S] > A[E]) swap(A, S, E);
            return E;
        }
        int M = (S + E) / 2;
        swap(A, S, M);  // 중앙값을 1번째 요소로 이동하기
        int pivot = A[S];
        int i = S + 1, j = E;
        while (i <= j) {
            while (j >= S + 1 && pivot < A[j]) {    // 피벗보다 작은 수가 나올 때까지 j--
                j--;
            }
            while (i <= E && pivot > A[i]) {        // 피벗보다 큰 수가 나올 때까지 i++
                i++;
            }
            if (i <= j) {
                swap(A, i++, j--);
            }
        }
        // 피벗 데이터를 나눠진 두 그룹의 경계 index에 저장하기
        A[S] = A[j];
        A[j] = pivot;
        return j;
    }

    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}