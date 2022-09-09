package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TheNumberOfWeakCharactersInTheGameTest {

    @Test
    public void defaultTest() {
        assertEquals(
                0,
                new TheNumberOfWeakCharactersInTheGame(
                        new int[][]{{5, 5}, {6, 3}, {3, 6}}
                ).solution()
        );
    }

}
