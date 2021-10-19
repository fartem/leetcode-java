package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KthLargestElementInAStreamTest {

    @Test
    public void defaultTest() {
        KthLargestElementInAStream kthLargestElementInAStream = new KthLargestElementInAStream(
                3,
                new int[]{4, 5, 8, 2}
        );
        assertEquals(
                4,
                kthLargestElementInAStream.add(3)
        );
        assertEquals(
                5,
                kthLargestElementInAStream.add(5)
        );
        assertEquals(
                5,
                kthLargestElementInAStream.add(10)
        );
        assertEquals(
                8,
                kthLargestElementInAStream.add(9)
        );
        assertEquals(
                8,
                kthLargestElementInAStream.add(4)
        );
    }

}
