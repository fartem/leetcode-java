package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreatestEnglishLetterInUpperAndLowerCaseTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "E",
                new GreatestEnglishLetterInUpperAndLowerCase("lEeTcOdE").solution()
        );
    }

}
