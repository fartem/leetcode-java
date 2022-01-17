package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Test;

public class StringMatchingInAnArrayTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList("as", "hero"),
                new StringMatchingInAnArray(Arrays.asList("mass", "as", "hero", "superhero"))
                        .solution());
    }
}
