import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ps39 {
    public static void main(String[] args) {
            long[] numSum = new long[20];
            numSum = recursiveNumSum(20, 0, numSum, 0);
            System.out.println();
    }

    private static long[] recursiveNumSum(int size, long sum, long[] numSum, int index){
        if(index >= size) return numSum;

//        sum += num[index];
        sum += index + 1;
        numSum[index] = sum;
        index++;

        return recursiveNumSum(size, sum, numSum, index);
    }
}