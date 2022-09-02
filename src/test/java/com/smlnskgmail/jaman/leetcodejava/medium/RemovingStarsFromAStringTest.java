package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemovingStarsFromAStringTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "lecoe",
                new RemovingStarsFromAString("leet**cod*e").solution()
        );
    }

}
