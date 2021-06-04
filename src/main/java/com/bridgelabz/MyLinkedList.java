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
        Node tempNode=head;
        while (tempNode.next != null)
        {
            tempNode = tempNode.next;
        }
        tempNode.next=newNode;
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
        head=newNode;
        size++;
        return true;
    }
    public void printValue()
    {
        Node tempNode=head;
        if(tempNode==null)
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


