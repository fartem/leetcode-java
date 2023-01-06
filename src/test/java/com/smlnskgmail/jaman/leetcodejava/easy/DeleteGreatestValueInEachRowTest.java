package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeleteGreatestValueInEachRowTest {

    @Test
    public void defaultTests() {
        assertEquals(
                8,
                new DeleteGreatestValueInEachRow(
                        new int[][]{{1, 2, 4}, {3, 3, 1}}
                ).solution()
        );
        assertEquals(
                10,
                new DeleteGreatestValueInEachRow(new int[][]{{10}}).solution()
        );
    }

}
