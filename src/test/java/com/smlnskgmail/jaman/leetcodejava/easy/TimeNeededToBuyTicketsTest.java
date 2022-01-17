package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TimeNeededToBuyTicketsTest {

    @Test
    public void defaultTest() {
        assertEquals(6, new TimeNeededToBuyTickets(new int[] {2, 3, 2}, 2).solution());
    }
}
