package com.smlnskgmail.jaman.leetcodejava.hard;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class StampingTheSequenceTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{1, 0, 2},
                new StampingTheSequence("abc", "ababc").solution()
        );
    }

}
