package playground.ds;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by henry on 2/17/17.
 */
public class StackTest {

    @Test
    public void testNewEmptyStack() throws Exception {
        Stack stack = new Stack(10);
        assertEquals(0, stack.size());
    }

    @Test
    public void testPushAndPeek() throws Exception {
        Stack stack = new Stack(10);
        int input = 5;
        stack.push(input);
        assertEquals(stack.peek(), input);
    }

    @Test
    public void testPushAndCheckSize() throws Exception {
        Stack stack = new Stack(10);
        int input = 5;
        stack.push(input);
        stack.push(input);
        assertEquals(stack.size(), 2);
    }

    @Test
    public void testPushAndPop() throws Exception {
        Stack stack = new Stack(5);
        int input = 5;
        stack.push(input);
        int output = stack.pop();
        assertEquals(input, output);
    }

    @Test(expected = Stack.StackUnderflowException.class)
    public void testStackUnderflow() throws Exception {
        Stack stack = new Stack(10);
        stack.pop();
    }

    @Test(expected = Stack.StackOverflowException.class)
    public void testStackOverflow() throws Exception {
        Stack stack = new Stack(2);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
    }

    @Test(expected = Stack.StackEmptyException.class)
    public void testPeekEmptyStack() {
        Stack stack = new Stack(5);
        stack.peek();
    }
}