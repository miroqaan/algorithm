import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P1541 {
    public static void main(String[] args) throws IOException {
        // minus 45
        // plus 43
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder tmp = new StringBuilder();

        ArrayList<String> num = new ArrayList();
        ArrayList<String> oper = new ArrayList();
        int result = 0;

        for (int i = 0; i < input.length(); i++) {
            String target = input.substring(i, i + 1);

            if (!"-".equals(target) && !"+".equals(target)) {
                tmp.append(target);
            } else {
                num.add(tmp.toString());
                oper.add(target);
                tmp = new StringBuilder();
            }

//            System.out.println(i + " " + (input.length() - 1));
            if (i == input.length() - 1) {
                num.add(tmp.toString());
            }
        }

        Collections.sort(num);
        Collections.sort(oper);

//        for (String str : num) {
//            System.out.println(str);
//        }
//        for (String str : oper) {
//            System.out.println(str);
//        }

        for (int i = 0; i < num.size() - 1; i++) {
            int num1 = Integer.parseInt(num.get(i));
            int num2 = Integer.parseInt(num.get(i + 1));
            String calcOper = oper.get(i);

            result += calc(num1, num2, calcOper);
        }

        System.out.println(result);
    }

    public static int calc(int num1, int num2, String oper) {
        switch (oper) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            default:
                return -1;
        }
    }
}
