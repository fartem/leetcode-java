package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseWordsInAStringIIITest {

    @Test
    public void defaultTest() {
        assertEquals(
                "s'teL ekat edoCteeL tsetnoc",
                new ReverseWordsInAStringIII(
                        "Let's take LeetCode contest"
                ).solution()
        );
    }

}
