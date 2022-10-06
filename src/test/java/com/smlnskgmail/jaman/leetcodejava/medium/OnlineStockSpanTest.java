package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OnlineStockSpanTest {

    @Test
    public void defaultTest() {
        var onlineStockSpan = new OnlineStockSpan();
        assertEquals(1, onlineStockSpan.next(100));
        assertEquals(1, onlineStockSpan.next(80));
        assertEquals(1, onlineStockSpan.next(60));
        assertEquals(2, onlineStockSpan.next(70));
        assertEquals(1, onlineStockSpan.next(60));
        assertEquals(4, onlineStockSpan.next(75));
        assertEquals(6, onlineStockSpan.next(85));
    }

}
