package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoalParserInterpretationTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "Goal",
                new GoalParserInterpretation("G()(al)").solution()
        );
    }

}
