package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindTheTownJudgeTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new FindTheTownJudge(
                        2,
                        new int[][]{{1, 2}}
                ).solution()
        );
    }

}
