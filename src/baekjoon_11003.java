import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class baekjoon_11003 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력을 버퍼에 넣고 한 번에 출력하기 위해 BufferedWriter 사용
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        Deque<Node> mydeque = new LinkedList<>();
        for(int i = 0; i < N; i++){
            int now = Integer.parseInt(st.nextToken());

            // 새로운 값이 들어올 때마다 정렬하는 대신 현재 수보다 큰 값을 덱에서 제거해 시간 복잡도를 줄인다.
            while(!mydeque.isEmpty() && mydeque.getLast().getNodeValue() > now){

            }

        }
    }
}