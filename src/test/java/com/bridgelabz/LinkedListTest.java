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
        linkedList.printValue();
        System.out.println("-----------");
        Assert.assertEquals(3, size);
    }
    @Test
    public void givenValueShouldAddAtFirst()
    {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtFirst(70);
        linkedList.addAtFirst(30);
        linkedList.addAtFirst(56);
        int size=linkedList.size();
        linkedList.printValue();
        Assert.assertEquals(3, size);
    }
}
