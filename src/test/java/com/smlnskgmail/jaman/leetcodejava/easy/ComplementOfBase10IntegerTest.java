package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplementOfBase10IntegerTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new ComplementOfBase10Integer(
                        5
                ).solution()
        );
    }

}
