package com.bridgelabz;

import org.junit.Test;
import org.junit.Assert;

public class NodeTest
{
    @Test
    public void given3Node_shouldAddAtNextOfEachNode()
    {
        Node node1 = new Node();
        node1.data = 1;
        Node node2 = new Node();
        node2.data = 2;
        node1.next = node2;
        Node node3 = new Node();
        node3.data = 3;
        node2.next = node3;
        Integer node = null;
        boolean status = node1.next.equals(node2) && node2.next.equals(node3);
        Assert.assertTrue(status);
    }
}
