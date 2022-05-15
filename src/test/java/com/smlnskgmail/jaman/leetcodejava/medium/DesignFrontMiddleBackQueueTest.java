package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DesignFrontMiddleBackQueueTest {

    @Test
    public void defaultTest() {
        var designFrontMiddleBackQueue = new DesignFrontMiddleBackQueue();
        designFrontMiddleBackQueue.pushFront(1);
        designFrontMiddleBackQueue.pushBack(2);
        designFrontMiddleBackQueue.pushMiddle(3);
        designFrontMiddleBackQueue.pushMiddle(4);
        assertEquals(
                1,
                designFrontMiddleBackQueue.popFront()
        );
        assertEquals(
                3,
                designFrontMiddleBackQueue.popMiddle()
        );
        assertEquals(
                4,
                designFrontMiddleBackQueue.popMiddle()
        );
        assertEquals(
                2,
                designFrontMiddleBackQueue.popBack()
        );
        assertEquals(
                -1,
                designFrontMiddleBackQueue.popFront()
        );
    }

}
