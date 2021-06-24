package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RobotReturnToOriginTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new RobotReturnToOrigin(
                        "UD"
                ).solution()
        );
    }

}
