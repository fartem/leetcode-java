package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class DefuseTheBombTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[] {12, 10, 16, 13},
                new DefuseTheBomb(new int[] {5, 7, 1, 4}, 3).solution());
    }
}
