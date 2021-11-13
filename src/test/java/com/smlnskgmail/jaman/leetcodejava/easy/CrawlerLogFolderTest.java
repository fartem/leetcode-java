package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CrawlerLogFolderTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new CrawlerLogFolder(
                        new String[]{"d1/", "d2/", "../", "d21/", "./"}
                ).solution()
        );
    }

}
