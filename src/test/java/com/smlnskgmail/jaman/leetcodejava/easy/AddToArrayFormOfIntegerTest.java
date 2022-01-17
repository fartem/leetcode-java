package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Test;

public class AddToArrayFormOfIntegerTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList(1, 2, 3, 4),
                new AddToArrayFormOfInteger(new int[] {1, 2, 0, 0}, 34).solution());
    }
}
