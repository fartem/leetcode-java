package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Test;

public class PascalsTriangleIITest {

    @Test
    public void defaultTest() {
        assertEquals(Arrays.asList(1, 3, 3, 1), new PascalsTriangleII(3).solution());
    }
}
