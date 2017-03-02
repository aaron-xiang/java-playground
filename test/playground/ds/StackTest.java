package playground.ds;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackTest {
    AbstractStack<Integer> stack;

    @Before
    public void setup() {
        stack = new Stack<>(10);
    }

    @Test
    public void testNewEmptyStack() throws Exception {
        assertEquals(0, stack.size());
    }

    @Test
    public void testPushAndPeek() throws Exception {
        Integer input = 5;
        stack.push(input);
        assertEquals(stack.peek(), input);
    }

    @Test
    public void testPushAndCheckSize() throws Exception {
        int input = 5;
        stack.push(input);
        stack.push(input);
        assertEquals(stack.size(), 2);
    }

    @Test
    public void testPushAndPop() throws Exception {
        int input = 5;
        stack.push(input);
        int output = stack.pop();
        assertEquals(input, output);
    }

    @Test(expected = Stack.StackUnderflowException.class)
    public void testStackUnderflow() throws Exception {
        stack.pop();
    }

    @Test(expected = Stack.StackOverflowException.class)
    public void testStackOverflow() throws Exception {
        for (int i = 0; i < 20; i++) {
            stack.push(1);
        }
    }

    @Test(expected = Stack.StackEmptyException.class)
    public void testPeekEmptyStack() {
        stack.peek();
    }
}