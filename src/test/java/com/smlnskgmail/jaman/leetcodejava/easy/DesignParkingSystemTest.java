package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DesignParkingSystemTest {

    @Test
    public void defaultTest() {
        DesignParkingSystem designParkingSystem = new DesignParkingSystem(1, 1, 0);
        assertTrue(
                designParkingSystem.addCar(1)
        );
        assertTrue(
                designParkingSystem.addCar(2)
        );
        assertFalse(
                designParkingSystem.addCar(3)
        );
        assertFalse(
                designParkingSystem.addCar(1)
        );
    }

}
