public class ps56 {
    public static void main(String[] args) {
        System.out.println(fibonachi(6));
    }

    public static int fibonachi(int num) {
        if (num <= 2) {
            return 1;
        } else {
            return fibonachi(num - 1) + fibonachi(num - 2);
        }
    }
}