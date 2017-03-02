package playground.ds;

public class Stack<E> implements AbstractStack<E> {

    E[] data;
    int top;

    public static class StackOverflowException extends RuntimeException {}

    public static class StackUnderflowException extends RuntimeException {}

    public static class StackEmptyException extends RuntimeException {}

    public Stack(int size) {
        data = (E[]) new Object[size];
        top = -1;
    }


    @Override
    public void push(E input) {
        if (top >= data.length - 1)
            throw new StackOverflowException();
        top += 1;
        data[top] = input;
    }

    @Override
    public E peek() {
        if (top < 0)
            throw new StackEmptyException();
        return data[top];
    }

    @Override
    public E pop() {
        if (top < 0)
            throw new StackUnderflowException();
        E output = data[top];
        top -= 1;
        return output;
    }

    @Override
    public int size() {
        return top + 1;
    }
}
