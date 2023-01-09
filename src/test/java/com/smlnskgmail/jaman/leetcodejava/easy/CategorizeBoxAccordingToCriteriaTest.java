package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CategorizeBoxAccordingToCriteriaTest {

    @Test
    public void defaultTests() {
        assertEquals(
                "Heavy",
                new CategorizeBoxAccordingToCriteria(1000, 35, 700, 300).solution()
        );
        assertEquals(
                "Neither",
                new CategorizeBoxAccordingToCriteria(200, 50, 800, 50).solution()
        );
    }

}
