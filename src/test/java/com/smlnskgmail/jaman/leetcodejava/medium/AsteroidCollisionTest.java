package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class AsteroidCollisionTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{5, 10},
                new AsteroidCollision(new int[]{5, 10, -5}).solution()
        );
    }

}
