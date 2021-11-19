package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountSubmatricesWithAllOnesTest {

    @Test
    public void defaultTest() {
        assertEquals(
                13,
                new CountSubmatricesWithAllOnes(
                        new int[][]{
                                {1, 0, 1},
                                {1, 1, 0},
                                {1, 1, 0}
                        }
                ).solution()
        );
    }

}
