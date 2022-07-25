package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstLetterToAppearTwiceTest {

    @Test
    public void defaultTest() {
        assertEquals(
                'c',
                new FirstLetterToAppearTwice("abccbaacz").solution()
        );
    }

}
