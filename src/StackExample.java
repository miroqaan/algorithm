import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // push elements to the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // pop elements from the stack
        System.out.println(stack.pop());    // 3

        // peek at the top element of the stack
        System.out.println(stack.peek());   // 2

        // check if the stack is empty
        System.out.println(stack.empty());  // false

        // search for an element in the stack
        System.out.println(stack.search(1));    // 2
    }
}