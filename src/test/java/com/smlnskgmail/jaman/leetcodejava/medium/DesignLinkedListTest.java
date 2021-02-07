package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DesignLinkedListTest {

    @Test
    public void defaultTest() {
        DesignLinkedList linkedList = new DesignLinkedList();
        linkedList.addAtHead(7);
        linkedList.addAtHead(2);
        linkedList.addAtHead(1);
        linkedList.addAtIndex(3, 0);
        linkedList.deleteAtIndex(2);
        linkedList.addAtHead(6);
        linkedList.addAtTail(4);
        assertEquals(
                4,
                linkedList.get(4)
        );
        linkedList.addAtHead(4);
        linkedList.addAtIndex(5, 0);
        linkedList.addAtHead(6);
    }

}
