package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FindPlayersWithZeroOrOneLossesTest {

    @Test
    public void defaultTest() {
        assertEquals(
                List.of(List.of(1, 2, 10), List.of(4, 5, 7, 8)),
                new FindPlayersWithZeroOrOneLosses(
                        new int[][]{
                                {1, 3},
                                {2, 3},
                                {3, 6},
                                {5, 6},
                                {5, 7},
                                {4, 5},
                                {4, 8},
                                {4, 9},
                                {10, 4},
                                {10, 9}
                        }
                ).solution()
        );
    }

}
