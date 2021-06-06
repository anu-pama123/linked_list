package com.bridgelabz;

public class MyLinkedList
{
    private Node head;
    int size = 0;
    public boolean add(Integer data)
    {
        Node newNode = new Node(data);
        if (head == null)
        {
            head = newNode;
            size++;
            return true;
        }
        Node tempNode = head;
        while (tempNode.next != null)
        {
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
        size++;
        return true;
    }
    public int size()
    {
        return size;
    }
    public boolean addAtFirst(Integer data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
        return true;
    }
    public boolean addInOrder(Integer data)
    {
        Node newNode = new Node(data);
        if (head == null)
        {
            head = newNode;
            size++;
            return true;
        }
        Node tempNode=head;
        while (tempNode.next != null)
        {
            tempNode = tempNode.next;
        }
        tempNode.next=newNode;
        size++;
        return true;
    }
    public boolean addAtMiddle(Integer data, Integer value1, Integer value2)
    {
        Node newNode = new Node(data);
        Node tempNode = head;
        while (tempNode.next != null && tempNode.data != value1)
        {
            tempNode = tempNode.next;
            System.out.println(tempNode.data);
        }
        if(tempNode.data == value1)
        {
            if(tempNode.next.data == value2)
            {
                newNode.next = tempNode.next;
                tempNode.next=newNode;
                size++;
                return true;
            }
        }
        return false;
    }
    public Integer pop()
    {
        Integer first = head.data;
        head = head.next;
        return first;
    }
    public void printValue()
    {
        Node tempNode = head;
        if (tempNode == null)
        {
            return;
        }
        else
        {
            System.out.println(tempNode.data);
            while (tempNode.next != null)
            {
                tempNode = tempNode.next;
                System.out.println(tempNode.data);
            }
        }
    }
}




