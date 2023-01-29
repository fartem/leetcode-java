package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountDistinctNumbersOnBoardTest {

    @Test
    public void defaultTests() {
        assertEquals(4, new CountDistinctNumbersOnBoard(5).solution());
        assertEquals(2, new CountDistinctNumbersOnBoard(3).solution());
    }

}
