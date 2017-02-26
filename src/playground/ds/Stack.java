package playground.ds;

/**
 * Created by henry on 2/17/17.
 */
public class Stack {

    int[] data;
    int top;

    public class StackOverflowException extends RuntimeException {}

    public class StackUnderflowException extends RuntimeException {}

    public class StackEmptyException extends RuntimeException {}

    public Stack(int size) {
        data = new int[size];
        top = -1;
    }


    public void push(int input) {
        if (top >= data.length - 1)
            throw new StackOverflowException();
        top += 1;
        data[top] = input;
    }

    public int peek() {
        if (top < 0)
            throw new StackEmptyException();
        return data[top];
    }

    public int pop() {
        if (top < 0)
            throw new StackUnderflowException();
        int output = data[top];
        top -= 1;
        return output;
    }

    public int size() {
        return top + 1;
    }
}
