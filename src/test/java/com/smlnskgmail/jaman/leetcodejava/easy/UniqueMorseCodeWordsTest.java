package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UniqueMorseCodeWordsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2, new UniqueMorseCodeWords(new String[] {"gin", "zen", "gig", "msg"}).solution());
    }
}
