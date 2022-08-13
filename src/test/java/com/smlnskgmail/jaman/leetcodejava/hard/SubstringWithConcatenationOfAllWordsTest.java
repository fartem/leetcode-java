package com.smlnskgmail.jaman.leetcodejava.hard;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SubstringWithConcatenationOfAllWordsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                List.of(0, 9),
                new SubstringWithConcatenationOfAllWords(
                        "barfoothefoobarman",
                        new String[]{"foo", "bar"}
                ).solution()
        );
    }

}
