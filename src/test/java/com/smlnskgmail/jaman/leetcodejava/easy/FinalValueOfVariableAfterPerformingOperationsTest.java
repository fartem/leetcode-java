package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FinalValueOfVariableAfterPerformingOperationsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                1,
                new FinalValueOfVariableAfterPerformingOperations(
                        new String[]{"--X", "X++", "X++"}
                ).solution()
        );
    }

}