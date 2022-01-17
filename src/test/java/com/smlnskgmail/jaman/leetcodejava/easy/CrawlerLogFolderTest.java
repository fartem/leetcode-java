package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CrawlerLogFolderTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new CrawlerLogFolder(new String[] {"d1/", "d2/", "../", "d21/", "./"}).solution());
    }
}
