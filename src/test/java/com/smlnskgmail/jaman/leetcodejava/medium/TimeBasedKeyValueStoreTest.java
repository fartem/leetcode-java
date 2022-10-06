package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TimeBasedKeyValueStoreTest {

    @Test
    public void defaultTest() {
        var timeBasedKeyValueStore = new TimeBasedKeyValueStore();
        timeBasedKeyValueStore.set("foo", "bar", 1);
        assertEquals("bar", timeBasedKeyValueStore.get("foo", 1));
        assertEquals("bar", timeBasedKeyValueStore.get("foo", 3));
        timeBasedKeyValueStore.set("foo", "bar2", 4);
        assertEquals("bar2", timeBasedKeyValueStore.get("foo", 4));
        assertEquals("bar2", timeBasedKeyValueStore.get("foo", 5));
    }

}
