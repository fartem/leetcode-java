package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinaryPrefixDivisibleBy5Test {

    @Test
    public void defaultTest() {
        assertEquals(
                List.of(true, false, false),
                new BinaryPrefixDivisibleBy5(new int[]{0, 1, 1}).solution()
        );
    }

}
