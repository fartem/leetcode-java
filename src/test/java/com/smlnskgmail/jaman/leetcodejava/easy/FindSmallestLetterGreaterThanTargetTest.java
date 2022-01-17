package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindSmallestLetterGreaterThanTargetTest {

    @Test
    public void defaultTest() {
        assertEquals(
                'c',
                new FindSmallestLetterGreaterThanTarget(new char[] {'c', 'f', 'j'}, 'a')
                        .solution());
    }
}
