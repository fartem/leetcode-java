package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidPerfectSquareTest {

    @Test
    public void defaultTests() {
        assertTrue(new ValidPerfectSquare(16).solution());
        assertFalse(new ValidPerfectSquare(15).solution());
    }

}
