package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BaseballGameTest {

    @Test
    public void defaultTest() {
        assertEquals(30, new BaseballGame(new String[] {"5", "2", "C", "D", "+"}).solution());
    }
}
