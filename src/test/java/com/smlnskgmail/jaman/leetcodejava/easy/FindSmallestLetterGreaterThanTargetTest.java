package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindSmallestLetterGreaterThanTargetTest {

    @Test
    public void defaultTest() {
        assertEquals(
                'c',
                new FindSmallestLetterGreaterThanTarget(
                        new char[]{'c', 'f', 'j'},
                        'a'
                ).solution()
        );
    }

}
