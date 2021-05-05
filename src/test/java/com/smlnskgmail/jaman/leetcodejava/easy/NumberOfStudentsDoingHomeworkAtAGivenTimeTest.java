package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfStudentsDoingHomeworkAtAGivenTimeTest {

    @Test
    public void defaultTest() {
        assertEquals(
                1,
                new NumberOfStudentsDoingHomeworkAtAGivenTime(
                        new int[]{1, 2, 3},
                        new int[]{3, 2, 7},
                        4
                ).solution()
        );
    }

}
