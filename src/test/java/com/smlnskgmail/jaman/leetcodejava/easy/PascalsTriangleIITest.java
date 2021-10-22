package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PascalsTriangleIITest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList(1, 3, 3, 1),
                new PascalsTriangleII(3).solution()
        );
    }

}
