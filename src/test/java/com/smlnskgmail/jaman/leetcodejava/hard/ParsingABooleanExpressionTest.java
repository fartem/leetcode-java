package com.smlnskgmail.jaman.leetcodejava.hard;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ParsingABooleanExpressionTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new ParsingABooleanExpression(
                        "!(f)"
                ).solution()
        );
    }

}
