package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MeanOfArrayAfterRemovingSomeElementsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2.00000,
                new MeanOfArrayAfterRemovingSomeElements(
                                new int[] {
                                    1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3
                                })
                        .solution(),
                0);
    }
}
