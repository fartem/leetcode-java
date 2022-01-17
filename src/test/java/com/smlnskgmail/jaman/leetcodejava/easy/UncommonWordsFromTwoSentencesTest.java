package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class UncommonWordsFromTwoSentencesTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new String[] {"sweet", "sour"},
                new UncommonWordsFromTwoSentences("this apple is sweet", "this apple is sour")
                        .solution());
    }
}
