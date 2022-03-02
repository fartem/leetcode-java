package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DivideAStringIntoGroupsOfSizeKTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new String[]{"abc", "def", "ghi"},
                new DivideAStringIntoGroupsOfSizeK(
                        "abcdefghi",
                        3,
                        'x'
                ).solution()
        );
    }

}
