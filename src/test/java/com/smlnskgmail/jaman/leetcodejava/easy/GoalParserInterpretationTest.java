package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GoalParserInterpretationTest {

    @Test
    public void defaultTest() {
        assertEquals("Goal", new GoalParserInterpretation("G()(al)").solution());
    }
}
