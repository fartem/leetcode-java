package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class DetermineColorOfAChessboardSquareTest {

    @Test
    public void defaultTest() {
        assertFalse(
                new DetermineColorOfAChessboardSquare(
                        "a1"
                ).solution()
        );
    }

}
