package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberOfStudentsDoingHomeworkAtAGivenTimeTest {

    @Test
    public void defaultTest() {
        assertEquals(
                1,
                new NumberOfStudentsDoingHomeworkAtAGivenTime(
                                new int[] {1, 2, 3}, new int[] {3, 2, 7}, 4)
                        .solution());
    }
}
