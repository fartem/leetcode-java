package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CheckIfStringIsAPrefixOfArrayTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new CheckIfStringIsAPrefixOfArray(
                        "iloveleetcode",
                        new String[]{"i", "love", "leetcode", "apples"}
                ).solution()
        );
    }

}
