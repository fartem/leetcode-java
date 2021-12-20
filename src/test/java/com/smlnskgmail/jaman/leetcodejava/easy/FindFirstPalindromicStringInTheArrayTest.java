package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindFirstPalindromicStringInTheArrayTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "ada",
                new FindFirstPalindromicStringInTheArray(
                        new String[]{"abc", "car", "ada", "racecar", "cool"}
                ).solution()
        );
    }

}
