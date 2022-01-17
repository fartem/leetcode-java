package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FinalValueOfVariableAfterPerformingOperationsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                1,
                new FinalValueOfVariableAfterPerformingOperations(
                                new String[] {"--X", "X++", "X++"})
                        .solution());
    }
}
