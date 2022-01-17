package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberOfRecentCallsTest {

    @Test
    public void defaultTest() {
        var numberOfRecentCalls = new NumberOfRecentCalls();
        assertEquals(1, numberOfRecentCalls.ping(1));
        assertEquals(2, numberOfRecentCalls.ping(100));
        assertEquals(3, numberOfRecentCalls.ping(3001));
        assertEquals(3, numberOfRecentCalls.ping(3002));
    }
}
