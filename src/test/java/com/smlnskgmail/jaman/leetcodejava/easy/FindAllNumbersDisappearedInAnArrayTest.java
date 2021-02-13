package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FindAllNumbersDisappearedInAnArrayTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList(5, 6),
                new FindAllNumbersDisappearedInAnArray(
                        new int[]{4, 3, 2, 7, 8, 2, 3, 1}
                ).solution()
        );
    }

}
