package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AssignCookiesTest {

    @Test
    public void defaultTest() {
        assertEquals(
                1,
                new AssignCookies(
                        new int[]{1, 2, 3},
                        new int[]{1}
                ).solution()
        );
    }

}
