import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjoon_2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        mData[] A = new mData[N];

        for (int i = 0; i < N; i++) {
            A[i] = new mData(Integer.parseInt(br.readLine()), i);
        }

        Arrays.sort(A); // A 배열 정렬(O(nlogn) 시간 복잡도)
        int Max = 0;
        for (int i = 0; i < N; i++) {
            if (Max < A[i].index - i) {
                Max = A[i].index - i; // 정렬 전 index - 정렬 후 index의 최댓값 저장
            }
        }

        System.out.println(Max + 1);
    }
}

class mData implements Comparable<mData> {
    int value;
    int index;

    public mData(int value, int index) {
        super();
        this.value = value;
        this.index = index;
    }

    @Override
    public int compareTo(mData o) {
        return this.value - o.value; // 오름차순 정렬
    }
}