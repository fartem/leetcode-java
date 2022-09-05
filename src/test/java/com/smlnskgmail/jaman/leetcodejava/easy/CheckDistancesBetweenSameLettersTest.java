package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CheckDistancesBetweenSameLettersTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new CheckDistancesBetweenSameLetters(
                        "abaccb",
                        new int[]{
                                1, 3, 0, 5, 0,
                                0, 0, 0, 0, 0,
                                0, 0, 0, 0, 0,
                                0, 0, 0, 0, 0,
                                0, 0, 0, 0, 0,
                                0
                        }
                ).solution()
        );
    }

}
