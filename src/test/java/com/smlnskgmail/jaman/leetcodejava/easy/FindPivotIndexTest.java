package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindPivotIndexTest {

    @Test
    public void defaultTest() {
        assertEquals(3, new FindPivotIndex(new int[] {1, 7, 3, 6, 5, 6}).solution());
    }
}
