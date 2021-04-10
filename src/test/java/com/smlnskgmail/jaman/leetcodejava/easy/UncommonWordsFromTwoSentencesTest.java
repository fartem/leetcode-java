package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class UncommonWordsFromTwoSentencesTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new String[]{"sweet", "sour"},
                new UncommonWordsFromTwoSentences(
                        "this apple is sweet",
                        "this apple is sour"
                ).solution()
        );
    }

}
