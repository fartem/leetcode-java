package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindTheTownJudgeTest {

    @Test
    public void defaultTest() {
        assertEquals(2, new FindTheTownJudge(2, new int[][] {{1, 2}}).solution());
    }
}
