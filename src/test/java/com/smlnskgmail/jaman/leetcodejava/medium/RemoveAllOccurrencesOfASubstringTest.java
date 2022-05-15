package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveAllOccurrencesOfASubstringTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "dab",
                new RemoveAllOccurrencesOfASubstring(
                        "daabcbaabcbc",
                        "abc"
                ).solution()
        );
    }

}
