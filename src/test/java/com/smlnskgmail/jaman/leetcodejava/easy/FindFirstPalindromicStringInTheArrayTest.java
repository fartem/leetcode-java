package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindFirstPalindromicStringInTheArrayTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "ada",
                new FindFirstPalindromicStringInTheArray(
                                new String[] {"abc", "car", "ada", "racecar", "cool"})
                        .solution());
    }
}
