package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountAsterisksTest {

    @Test
    public void defaultTest() {
        assertEquals(2, new CountAsterisks("l|*e*et|c**o|*de|").solution());
    }

}
