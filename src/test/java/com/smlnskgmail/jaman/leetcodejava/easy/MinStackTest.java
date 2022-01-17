package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

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
