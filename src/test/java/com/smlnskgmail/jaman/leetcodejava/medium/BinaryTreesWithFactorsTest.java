package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryTreesWithFactorsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new BinaryTreesWithFactors(new int[]{2, 4}).solution()
        );
    }

}
