public class Stack3{
    private int[] arr;
    private int top;

    public Stack3(int size){
        arr = new int[size];
        top = -1;
    }

    public void push(int num){
        arr[++top] = num;
    }

    public int pop(){
        if(isEmpty()){
            throw new ArrayIndexOutOfBoundsException(("Stack is empty. Cannot pop."));
        }
        return arr[top--];
    }

    public int peek(){
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException(("Stack is empty. Cannot peek."));
        }
        return arr[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }
}