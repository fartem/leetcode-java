package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindWinnerOnATicTacToeGameTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "A",
                new FindWinnerOnATicTacToeGame(
                        new int[][]{{0, 0}, {2, 0}, {1, 1}, {2, 1}, {2, 2}}
                ).solution()
        );
    }

}
