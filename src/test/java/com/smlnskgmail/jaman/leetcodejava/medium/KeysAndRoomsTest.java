package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class KeysAndRoomsTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new KeysAndRooms(
                        List.of(List.of(1), List.of(2), List.of(3), Collections.emptyList())
                ).solution()
        );
    }

}
