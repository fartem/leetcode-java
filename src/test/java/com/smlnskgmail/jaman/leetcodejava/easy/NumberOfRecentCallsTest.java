package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfRecentCallsTest {

    @Test
    public void defaultTest() {
        var numberOfRecentCalls = new NumberOfRecentCalls();
        assertEquals(
                1,
                numberOfRecentCalls.ping(1)
        );
        assertEquals(
                2,
                numberOfRecentCalls.ping(100)
        );
        assertEquals(
                3,
                numberOfRecentCalls.ping(3001)
        );
        assertEquals(
                3,
                numberOfRecentCalls.ping(3002)
        );
    }

}
