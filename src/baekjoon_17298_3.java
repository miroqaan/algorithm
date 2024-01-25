import java.io.*;
import java.util.Stack;

// 4
// 3 5 2 7

// 4
// 9 5 4 8
// 백준 17298 오큰수 구하기
public class baekjoon_17298_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] A = new int[n];
        int[] ans = new int[n];
        String[] str = bf.readLine().split(" ");
        for(int i = 0; i < n; i++){
            A[i] = Integer.parseInt(str[i]);
        }
        Stack<Integer> myStack = new Stack<>();
        myStack.push(0);    // 처음엔 항상 스택에 비어 있으므로 최초 값을 push해 초기화
        for(int i = 1; i < n; i++){
            // 스택이 비어 있지 않고 현재 수열이 스택 top 인덱스가 가리키는 수열보다 클 경우
            while(!myStack.isEmpty() && A[myStack.peek()] < A[i]){
                ans[myStack.pop()] = A[i];  // 정답 배열에 오큰수를 현재 수열로 저장하기
            }
            myStack.push(i);    // 신규 데이터 push
        }
        while(!myStack.empty()){
            ans[myStack.pop()] = -1;    // 스택에 남아있는 인덱스들은 오큰수가 없으므로 -1로 초기화
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < n; i++){
            bw.write(ans[i] + " ");
        }

        bw.write("\n");
        bw.flush();
    }
}