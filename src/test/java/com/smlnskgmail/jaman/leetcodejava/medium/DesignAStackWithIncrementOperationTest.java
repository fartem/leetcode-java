package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DesignAStackWithIncrementOperationTest {

    @Test
    public void defaultTest() {
        var designAStackWithIncrementOperation = new DesignAStackWithIncrementOperation(3);
        designAStackWithIncrementOperation.push(1);
        designAStackWithIncrementOperation.push(2);

        assertEquals(2, designAStackWithIncrementOperation.pop());

        designAStackWithIncrementOperation.push(2);
        designAStackWithIncrementOperation.push(3);
        designAStackWithIncrementOperation.push(4);
        designAStackWithIncrementOperation.increment(5, 100);
        designAStackWithIncrementOperation.increment(2, 100);

        assertEquals(103, designAStackWithIncrementOperation.pop());
        assertEquals(202, designAStackWithIncrementOperation.pop());
        assertEquals(201, designAStackWithIncrementOperation.pop());
        assertEquals(-1, designAStackWithIncrementOperation.pop());
    }

}
