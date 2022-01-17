package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MajorityElementTest {

    @Test
    public void defaultTest() {
        assertEquals(3, new MajorityElement(new int[] {3, 2, 3}).solution());
    }
}
