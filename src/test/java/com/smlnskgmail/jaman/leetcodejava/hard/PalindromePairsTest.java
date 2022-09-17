package com.smlnskgmail.jaman.leetcodejava.hard;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PalindromePairsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                List.of(List.of(0, 1), List.of(1, 0), List.of(3, 2), List.of(2, 4)),
                new PalindromePairs(new String[]{"abcd", "dcba", "lls", "s", "sssll"}).solution()
        );
    }

}