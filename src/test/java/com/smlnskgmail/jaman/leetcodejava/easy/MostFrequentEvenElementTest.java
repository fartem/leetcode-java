package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MostFrequentEvenElementTest {

    @Test
    public void defaultTest() {
        assertEquals(2, new MostFrequentEvenElement(new int[]{0, 1, 2, 2, 4, 4, 1}).solution());
    }

}
