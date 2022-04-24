package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DesignUndergroundSystemTest {

    @Test
    public void defaultTest() {
        DesignUndergroundSystem designUndergroundSystem = new DesignUndergroundSystem();
        designUndergroundSystem.checkIn(45, "Leyton", 3);
        designUndergroundSystem.checkIn(32, "Paradise", 8);
        designUndergroundSystem.checkIn(27, "Leyton", 10);
        designUndergroundSystem.checkOut(45, "Waterloo", 15);
        designUndergroundSystem.checkOut(27, "Waterloo", 20);
        designUndergroundSystem.checkOut(32, "Cambridge", 22);
        assertEquals(
                14.00000,
                designUndergroundSystem.getAverageTime("Paradise", "Cambridge"),
                0
        );
        assertEquals(
                11.00000,
                designUndergroundSystem.getAverageTime("Leyton", "Waterloo"),
                0
        );
        designUndergroundSystem.checkIn(10, "Leyton", 24);
        assertEquals(
                11.00000,
                designUndergroundSystem.getAverageTime("Leyton", "Waterloo"),
                0
        );
        designUndergroundSystem.checkOut(10, "Waterloo", 38);
        assertEquals(
                12.0000,
                designUndergroundSystem.getAverageTime("Leyton", "Waterloo"),
                0
        );
    }

}
