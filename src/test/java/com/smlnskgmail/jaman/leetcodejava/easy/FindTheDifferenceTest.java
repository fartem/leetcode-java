package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindTheDifferenceTest {

    @Test
    public void defaultTest() {
        assertEquals(
                'e',
                new FindTheDifference("abcd", "abcde").solution()
        );
    }

}
