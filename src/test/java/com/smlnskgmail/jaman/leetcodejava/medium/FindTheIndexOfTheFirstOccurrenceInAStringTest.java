package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindTheIndexOfTheFirstOccurrenceInAStringTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new FindTheIndexOfTheFirstOccurrenceInAString(
                        "hello",
                        "ll"
                ).solution()
        );
    }

}
