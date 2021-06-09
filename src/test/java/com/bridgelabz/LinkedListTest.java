package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest
{
    @Test
    public void givenValue_ShouldAddInLinkedList() {
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
    public void givenValue_ShouldAddAtFirst() {
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
    public void givenValues_ShouldAddInOrder() {
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
    public void givenValue_ShouldAddAtMiddle() {
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
    public void givenValue_ShouldPopElement() {
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
    public void givenLastValue_ShouldPopElement() {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(56);
        linkedList.add(36);
        linkedList.add(70);
        int last = linkedList.popLast(70);
        linkedList.printValue();
        System.out.println("--------After pop--------");
        Assert.assertEquals(70, last);
    }

    @Test
    public void givenValue_ShouldSearchInTheList() {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(56);
        linkedList.add(30);
        linkedList.add(70);
        boolean searchvalue = linkedList.search(30);
        linkedList.printValue();
        System.out.println("--------After search--------");
        Assert.assertEquals(true, searchvalue );
    }

    @Test
    public void givenValue_ShouldAddInTheList() {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(56);
        linkedList.add(30);
        linkedList.add(70);
        linkedList.insert(40, 30);
        int size=linkedList.size();
        linkedList.printValue();
        System.out.println("--------After inserting--------");
        Assert.assertEquals(4, size);
    }
}
