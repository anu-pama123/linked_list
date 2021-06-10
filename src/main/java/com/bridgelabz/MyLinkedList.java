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

    //Linked list by adding 30 and 56 to 70
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

    //Linked list by appending 30 and 70 to 56
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

    //Method to insert a value inbetween two values
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

    //Method to  delete fist element of linked list
    public Integer popFirst() {
        Integer first = head.data;
        head = head.next;
        return first;
    }

    //Method to delete delete  last element of linked list
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

    //Method to search a value in linked list
    public boolean search(int searchValue) {
        Node tempNode = head;
        boolean result=false;
        if(tempNode.data==searchValue) {
            result= true;
        }
        while (tempNode.next != null){
         if (tempNode.next.data == searchValue) {
             result= true;
             break;
         }
        }
        return result;
    }

    //Method to insert a value in linked list
    public boolean insert(int insertValue, int value1) {
        Node newNode = new Node(insertValue);
        Node tempNode = head;
        while (tempNode != null && tempNode.data != value1) {
            tempNode = tempNode.next;
        }
        if(tempNode.data == value1) {
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            size++;
            return true;
        }
        return false;
    }

    //Method to delete a value from linked list
    public int popPos(int pos) {
        Node tempNode = head;
        Node tempNode1=head;
        int counter=1;
        while (tempNode != null &&  counter <= pos) {
            tempNode1=tempNode;
            tempNode = tempNode.next;
            counter++;
        }
        if(counter==pos+1) {
            tempNode1.next= tempNode1.next;
            size--;
            return size;
        }
        return size;
    }

    //Method to create linked list in ascending order
    public int addAscendingOrder(int insertValue) {
        Node newNode = new Node(insertValue);
        Node tempNode = head;
        if (head==null){
            head=newNode;
        }else {
            while (tempNode.next != null && tempNode.data < insertValue) {
                tempNode = tempNode.next;
            }
            if(tempNode==head&&tempNode.data>insertValue) {
                newNode.next=tempNode;
                head=newNode;
            }else {
                newNode.next=tempNode.next;
                tempNode.next=newNode;
            }
        }
        size++;
        return size;
    }

    //Method to print value
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



