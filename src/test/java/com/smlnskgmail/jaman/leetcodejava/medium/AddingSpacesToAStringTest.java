package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddingSpacesToAStringTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "Leetcode Helps Me Learn",
                new AddingSpacesToAString(
                        "LeetcodeHelpsMeLearn",
                        new int[]{8, 13, 15}
                ).solution()
        );
    }

}
