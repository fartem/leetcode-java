package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberOfStringsThatAppearAsSubstringsInWordTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new NumberOfStringsThatAppearAsSubstringsInWord(
                                new String[] {"a", "abc", "bc", "d"}, "abc")
                        .solution());
    }
}
