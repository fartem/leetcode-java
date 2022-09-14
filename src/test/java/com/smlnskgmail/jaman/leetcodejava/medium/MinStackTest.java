package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinStackTest {

    @Test
    public void defaultTest() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        assertEquals(-3, minStack.getMin());

        minStack.pop();
        assertEquals(0, minStack.top());

        minStack.getMin();
    }

}
