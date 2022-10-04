package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindTheMiddleIndexInArrayTest {

    @Test
    public void defaultTest() {
        assertEquals(3, new FindTheMiddleIndexInArray(new int[]{2, 3, -1, 8, 4}).solution());
    }

}
