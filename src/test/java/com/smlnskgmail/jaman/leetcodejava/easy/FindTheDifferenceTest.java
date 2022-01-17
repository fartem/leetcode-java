package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindTheDifferenceTest {

    @Test
    public void defaultTest() {
        assertEquals('e', new FindTheDifference("abcd", "abcde").solution());
    }
}
