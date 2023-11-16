import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// DNA 비밀번호
public class baekjoon_12891 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] inputs = br.readLine().split(" ");
            int S = Integer.parseInt(inputs[0]);
            int P = Integer.parseInt(inputs[1]);

            String allStr = br.readLine();
//            int S = 9;
//            int P = 8;
//            int S = 4;
//            int P = 2;
            int cnt = 0;
            String[] condInput = br.readLine().split(" ");
            int[] condition = {Integer.parseInt(condInput[0]), Integer.parseInt(condInput[1]), Integer.parseInt(condInput[2]), Integer.parseInt(condInput[3])};

//            String allStr = "CCTGGATTG";
//            String allStr = "GATA";

            int startIdx = 0;
            int endIdx = P;
//            int[] condition = {2, 0, 1, 1};
//            int[] condition = {1, 0, 0, 1};

            while(endIdx <= S){
//                System.out.println("startIdx: " + startIdx);
//                System.out.println("endIdx: " + endIdx);


//                for(int i = startIdx; i < endIdx; i++){
                    String partOfStr = allStr.substring(startIdx, endIdx);
//                    System.out.println("partOfStr: " + partOfStr);

                    int cntA = 0;
                    int cntC = 0;
                    int cntG = 0;
                    int cntT = 0;

                    for(int j = 0; j < partOfStr.length(); j++){
//                        System.out.println("partOfStr.charAt(j): " + partOfStr.charAt(j));

                        if("A".equals(String.valueOf(partOfStr.charAt(j)))){
                            cntA++;
                        }else if("C".equals(String.valueOf(partOfStr.charAt(j)))){
                            cntC++;
                        }else if("G".equals(String.valueOf(partOfStr.charAt(j)))){
                            cntG++;
                        }else if("T".equals(String.valueOf(partOfStr.charAt(j)))){
                            cntT++;
                        }

//                        System.out.println("cntA: " + cntA);
//                        System.out.println("cntC: " + cntC);
//                        System.out.println("cntG: " + cntG);
//                        System.out.println("cntT: " + cntT);
                    }
                    if(cntA == condition[0] && cntC == condition[1] && cntG == condition[2] && cntT == condition[3]){
                        cnt++;
                    }
//                }

                startIdx++;
                endIdx++;
            }


            System.out.println(cnt);







            // ACGT
            // CCTGGATTG
            // A1, C2, G3, T3
            // 먼저 알파벳 개수를 센다.
            // 8개라면 1부터 8까지 가능하다.
            // 부분문자열은 문자열의 일부를 자른 것이다.
            // 9 8 이라면 인덱스 0부터 8개를 먼저 자른다. 이후 우측으로 한칸씩 이동하며 부분문자열을 구한다.


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}