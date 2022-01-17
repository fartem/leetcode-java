package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ShortestDistanceToACharacterTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[] {3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0},
                new ShortestDistanceToACharacter("loveleetcode", 'e').solution());
    }
}
