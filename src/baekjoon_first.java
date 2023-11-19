import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_first {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] inputs = br.readLine().split(" ");
            int S = Integer.parseInt(inputs[0]);
            int P = Integer.parseInt(inputs[1]);

            String allStr = br.readLine();
            int cnt = 0;
            String[] condInput = br.readLine().split(" ");
            int[] condition = {Integer.parseInt(condInput[0]), Integer.parseInt(condInput[1]), Integer.parseInt(condInput[2]), Integer.parseInt(condInput[3])};

            int startIdx = 0;
            int endIdx = P;

            while(endIdx <= S){
                String partOfStr = allStr.substring(startIdx, endIdx);

                int cntA = 0;
                int cntC = 0;
                int cntG = 0;
                int cntT = 0;

                for(int j = 0; j < partOfStr.length(); j++){
                    if("A".equals(String.valueOf(partOfStr.charAt(j)))){
                        cntA++;
                    }else if("C".equals(String.valueOf(partOfStr.charAt(j)))){
                        cntC++;
                    }else if("G".equals(String.valueOf(partOfStr.charAt(j)))){
                        cntG++;
                    }else if("T".equals(String.valueOf(partOfStr.charAt(j)))){
                        cntT++;
                    }
                }
                if(cntA == condition[0] && cntC == condition[1] && cntG == condition[2] && cntT == condition[3]){
                    cnt++;
                }
                startIdx++;
                endIdx++;
            }

            System.out.println(cnt);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}