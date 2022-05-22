package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PercentageOfLetterInStringTest {

    @Test
    public void defaultTest() {
        assertEquals(
                33,
                new PercentageOfLetterInString("foobar", 'o').solution()
        );
    }

}
