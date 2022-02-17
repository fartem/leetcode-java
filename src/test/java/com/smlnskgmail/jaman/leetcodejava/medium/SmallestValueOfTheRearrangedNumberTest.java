package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmallestValueOfTheRearrangedNumberTest {

    @Test
    public void defaultTest() {
        assertEquals(
                103,
                new SmallestValueOfTheRearrangedNumber(301).solution()
        );
        assertEquals(
                -7650,
                new SmallestValueOfTheRearrangedNumber(-7605).solution()
        );
    }

}
