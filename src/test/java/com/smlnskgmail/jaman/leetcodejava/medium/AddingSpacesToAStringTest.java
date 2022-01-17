package com.smlnskgmail.jaman.leetcodejava.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddingSpacesToAStringTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "Leetcode Helps Me Learn",
                new AddingSpacesToAString("LeetcodeHelpsMeLearn", new int[] {8, 13, 15})
                        .solution());
    }
}
