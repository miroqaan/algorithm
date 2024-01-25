public class Stack2 {
    private int[] arr;
    private int top;

    public Stack2() {
        arr = new int[100000];
        top = -1;
    }

    public void push(int num) {
        arr[++top] = num;
    }

    public int pop() {
        if (top == -1) {
            return -1;
        }
        return arr[top--];
    }

    public int peek() {
        if (top == -1) {
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}