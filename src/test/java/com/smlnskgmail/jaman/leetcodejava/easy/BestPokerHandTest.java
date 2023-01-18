package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BestPokerHandTest {

    @Test
    public void defaultTests() {
        assertEquals(
                "Flush",
                new BestPokerHand(
                        new int[]{13, 2, 3, 1, 9},
                        new char[]{'a', 'a', 'a', 'a', 'a'}
                ).solution()
        );
        assertEquals(
                "Three of a Kind",
                new BestPokerHand(
                        new int[]{4, 4, 2, 4, 4},
                        new char[]{'d', 'a', 'a', 'b', 'c'}
                ).solution()
        );
        assertEquals(
                "Pair",
                new BestPokerHand(
                        new int[]{10, 10, 2, 12, 9},
                        new char[]{'a', 'b', 'c', 'a', 'd'}
                ).solution()
        );
    }

}
