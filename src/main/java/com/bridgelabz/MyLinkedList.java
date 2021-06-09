package com.bridgelabz;

public class MyLinkedList
{
    private Node head;
    int size = 0;

    public boolean add(Integer data)
    {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            size++;
            return true;
        }
        Node tempNode = head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
        size++;
        return true;
    }

    public int size() {
        return size;
    }
    public boolean addAtFirst(Integer data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
        return true;
    }

    public boolean addInOrder(Integer data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            size++;
            return true;
        }
        Node tempNode=head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next=newNode;
        size++;
        return true;
    }

    public boolean addAtMiddle(Integer data, Integer value1, Integer value2) {
        Node newNode = new Node(data);
        Node tempNode = head;
        while (tempNode.next != null && tempNode.data != value1) {
            tempNode = tempNode.next;
            System.out.println(tempNode.data);
        }
        if(tempNode.data == value1) {
            if(tempNode.next.data == value2) {
                newNode.next = tempNode.next;
                tempNode.next=newNode;
                size++;
                return true;
            }
        }
        return false;
    }

    public Integer popFirst() {
        Integer first = head.data;
        head = head.next;
        return first;
    }

    public Integer popLast(Integer data) {
        if (head == null) {
            return 0;
        }
        Node tempNode=head;
        Node tempNode1=tempNode;
        while (tempNode.next != null) {
            tempNode1=tempNode;
            tempNode = tempNode.next;
        }
        size--;
        tempNode1.next = null;
        Integer last = tempNode.data;
        return last;
    }

    public boolean search(int searchValue) {
        Node tempNode = head;
        boolean result=false;
        if(tempNode.data==searchValue){
            result= true;
        }
        while (tempNode.next != null){
         if (tempNode.next.data == searchValue){
             result= true;
             break;
         }
        }
        return result;
    }

    public boolean insert(int insertValue, int value1) {
        Node newNode = new Node(insertValue);
        Node tempNode = head;
        while (tempNode != null && tempNode.data != value1) {
            tempNode = tempNode.next;
        }
        if(tempNode.data == value1){
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            size++;
            return true;
        }
        return false;
    }

    public void printValue() {
        Node tempNode = head;
        if (tempNode == null) {
            return;
        }
        else {
            System.out.println(tempNode.data);
            while (tempNode.next != null) {
                tempNode = tempNode.next;
                System.out.println(tempNode.data);
            }
        }
    }
}



