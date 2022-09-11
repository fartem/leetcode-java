package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CheckIfNumbersAreAscendingInASentenceTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new CheckIfNumbersAreAscendingInASentence(
                        "1 box has 3 blue 4 red 6 green and 12 yellow marbles"
                ).solution()
        );
    }

}
