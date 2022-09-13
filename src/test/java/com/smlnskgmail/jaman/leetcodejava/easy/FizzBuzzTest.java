package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Collections.singletonList("1"),
                new FizzBuzz(1).solution()
        );
    }

}
