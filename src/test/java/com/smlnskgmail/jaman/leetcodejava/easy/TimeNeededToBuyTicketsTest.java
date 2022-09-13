package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TimeNeededToBuyTicketsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                6,
                new TimeNeededToBuyTickets(new int[]{2, 3, 2}, 2).solution()
        );
    }

}
