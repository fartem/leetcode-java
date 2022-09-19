package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FindDuplicateFileInSystemTest {

    @Test
    public void defaultTest() {
        assertEquals(
                List.of(
                        List.of("root/a/2.txt", "root/c/d/4.txt", "root/4.txt"),
                        List.of("root/a/1.txt", "root/c/3.txt")
                ),
                new FindDuplicateFileInSystem(
                        new String[]{
                                "root/a 1.txt(abcd) 2.txt(efgh)",
                                "root/c 3.txt(abcd)",
                                "root/c/d 4.txt(efgh)",
                                "root 4.txt(efgh)"
                        }
                ).solution()
        );
    }

}
