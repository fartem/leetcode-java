package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeatReservationManagerTest {

    @Test
    public void defaultTest() {
        var seatReservationManager = new SeatReservationManager(5);
        assertEquals(1, seatReservationManager.reserve());
        assertEquals(2, seatReservationManager.reserve());

        seatReservationManager.unreserve(2);
        assertEquals(2, seatReservationManager.reserve());
        assertEquals(3, seatReservationManager.reserve());
        assertEquals(4, seatReservationManager.reserve());
        assertEquals(5, seatReservationManager.reserve());
    }

}
