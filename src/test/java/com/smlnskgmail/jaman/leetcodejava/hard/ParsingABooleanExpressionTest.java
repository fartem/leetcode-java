package com.smlnskgmail.jaman.leetcodejava.hard;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ParsingABooleanExpressionTest {

    @Test
    public void defaultTest() {
        assertTrue(new ParsingABooleanExpression("!(f)").solution());
    }
}
