package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddDigitsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new AddDigits(
                        38
                ).solution()
        );
    }

}
