package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvaluateReversePolishNotationTest {

    @Test
    public void defaultTest() {
        assertEquals(
                9,
                new EvaluateReversePolishNotation(
                        new String[]{"2", "1", "+", "3", "*"}
                ).solution()
        );
    }

}
