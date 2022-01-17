package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseWordsInAStringIIITest {

    @Test
    public void defaultTest() {
        assertEquals(
                "s'teL ekat edoCteeL tsetnoc",
                new ReverseWordsInAStringIII("Let's take LeetCode contest").solution());
    }
}
