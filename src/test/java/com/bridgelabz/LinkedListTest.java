package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest
{
    @Test
    public void givenValueShouldAddInLinkedList()
    {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(56);
        linkedList.add(36);
        linkedList.add(70);
        int size=linkedList.size();
        Assert.assertEquals(3, size);
    }
}
