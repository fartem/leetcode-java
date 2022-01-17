package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void defaultTest() {
        assertEquals(Collections.singletonList("1"), new FizzBuzz(1).solution());
    }
}
