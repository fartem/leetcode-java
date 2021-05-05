package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class StringMatchingInAnArrayTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList(
                        "as",
                        "hero"
                ),
                new StringMatchingInAnArray(
                        Arrays.asList(
                                "mass",
                                "as",
                                "hero",
                                "superhero"
                        )
                ).solution()
        );
    }

}
