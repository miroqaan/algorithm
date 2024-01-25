public class ps57 {
    public static void main(String[] args) {
        divide(0, 0, 8, 8);
    }

    public static void divide(int x1, int y1, int x2, int y2) {
        int size_x = (x2 - x1) / 2;
        int size_y = (y2 - y1) / 2;

        if(size_x <= 0 || size_y <= 0) {
            return;
        }

        System.out.println("Dividing (" + x1 + ", " + y1 + ", " + x2 + ", " + y2 + ")");

        divide(x1, y1, x1 + size_x, y1 + size_y);
        divide(x1 + size_x, y1, x2, y1 + size_y);
        divide(x1, y1 + size_y, x1 + size_x, y2);
        divide(x1 + size_x, y1 + size_y, x2, y2);
    }
}