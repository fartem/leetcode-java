package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CheckIfStringIsAPrefixOfArrayTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new CheckIfStringIsAPrefixOfArray(
                                "iloveleetcode", new String[] {"i", "love", "leetcode", "apples"})
                        .solution());
    }
}
