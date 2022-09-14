package com.smlnskgmail.jaman.leetcodejava.hard;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumFrequencyStackTest {

    @Test
    public void defaultTest() {
        var maximumFrequencyStack = new MaximumFrequencyStack();
        maximumFrequencyStack.push(5);
        maximumFrequencyStack.push(7);
        maximumFrequencyStack.push(5);
        maximumFrequencyStack.push(7);
        maximumFrequencyStack.push(4);
        maximumFrequencyStack.push(5);

        assertEquals(5, maximumFrequencyStack.pop());
        assertEquals(7, maximumFrequencyStack.pop());
        assertEquals(5, maximumFrequencyStack.pop());
        assertEquals(4, maximumFrequencyStack.pop());
    }

}
