package com.smlnskgmail.jaman.leetcodejava.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountSubmatricesWithAllOnesTest {

    @Test
    public void defaultTest() {
        assertEquals(
                13,
                new CountSubmatricesWithAllOnes(
                                new int[][] {
                                    {1, 0, 1},
                                    {1, 1, 0},
                                    {1, 1, 0}
                                })
                        .solution());
    }
}
