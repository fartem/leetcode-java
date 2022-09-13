package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveElementTest {

    @Test
    public void defaultTest() {
        final int[] input = new int[]{3, 2, 2, 3};
        final int value = 3;
        final int index = new RemoveElement(input, value).solution();
        for (int i = 0; i < index; i++) {
            assertEquals(2, input[i]);
        }
    }

}
