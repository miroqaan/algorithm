import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class s1 {
    // 산술평균
    int soultion1(int[] arr) {
        double sum = 0;
        double avg;

        for (int n : arr) {
            sum += n;
        }

        avg = sum / arr.length;

        return (int) Math.round(avg);
    }

    // 중앙값(데이터 개수가 홀수일 때 중앙값은 정렬된 결과의 가운데 수이다)
    int soultion2(int[] arr) {
        return arr[(arr.length / 2)];
    }

    // 최빈값(최빈값이 여러 개 있을 땐 최빈값 중 두 번째로 작은 값 출력)
    int soultion3(int[] arr) {
        int count = 0;
        int max = 0;
        List<Integer> mode = new ArrayList<>();

        if (arr.length == 1) {
            return arr[0];
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                // 다음 수와 같을 때 최빈값 카운트 +1
                count++;
            }else {
                // 다음 수와 다를 때 최빈값 초기화
                count = 0;
            }

            if (max < count) {
                // 카운트가 최빈값 최대치보다 클 때 최대치 업데이트
                max = count;

                // 최빈값 리스트 초기화
                mode = new ArrayList<>();
                mode.add(arr[i]);
            }else if (max == count) {
                // 최빈값이 현재 최대치와 같다면 최빈값 리스트 초기화 없이 리스트에 추가
                mode.add(arr[i]);
            }
        }

        if (mode.size() > 1) {
            return mode.get(1);
        } else {
            return mode.get(0);
        }
    }

    // 범위(최댓값과 최솟값의 차이)
    int soultion4(int[] arr) {
        return arr[arr.length - 1] - arr[0];
    }
}

public class ps1 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s1 s = new s1();
        StringBuilder sb = new StringBuilder();

        try {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }

            Arrays.sort(arr);

            sb.append(s.soultion1(arr) + "\n");
            sb.append(s.soultion2(arr) + "\n");
            sb.append(s.soultion3(arr) + "\n");
            sb.append(s.soultion4(arr));

            System.out.println(sb);
            br.close();
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
    }
}