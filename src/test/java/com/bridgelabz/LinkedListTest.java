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
        System.out.println("----values added in linked list-------");
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
        System.out.println("----given value at first-------");
        Assert.assertEquals(3, size);
    }
    @Test
    public void givenFirstValuesShouldAddInOrder()
    {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addInOrder(56);
        linkedList.addInOrder(30);
        linkedList.addInOrder(70);
        int size=linkedList.size();
        linkedList.printValue();
        System.out.println("----vales added in order-------");
        Assert.assertEquals(3, size);
    }
    @Test
    public void givenValueShouldAddAtMiddle()
    {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addInOrder(56);
        linkedList.addInOrder(70);
        linkedList.addAtMiddle(30, 56, 70);
        int size=linkedList.size();
        linkedList.printValue();
        System.out.println("----given value at middle-------");
        Assert.assertEquals(3, size);
    }
    @Test
    public void givenValueShouldPopElement()
    {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(56);
        linkedList.add(36);
        linkedList.add(70);
        int first = linkedList.popFirst();
        linkedList.printValue();
        System.out.println("--------After pop--------");
        Assert.assertEquals(56, first);
    }
    @Test
    public void givenLastValueShouldPopElement()
    {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(56);
        linkedList.add(36);
        linkedList.add(70);
        int last = linkedList.popLast(70);
        linkedList.printValue();
        System.out.println("--------After pop--------");
        Assert.assertEquals(70, last);
    }
}
