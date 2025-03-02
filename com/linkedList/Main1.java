package com.linkedList;

public class Main1 {
    public static void main(String[] args) {
        Node1 node1=new Node1(55);
        System.out.println("printing data "+node1.data);
        System.out.println("printing next "+node1.next);
        Node1 node2=new Node1(66);
        node1.next=node2;
        System.out.println(node1.next);
        System.out.println(node2.data);
        System.out.println("before linked with node 3 checking next"+node2.next);
        Node1 n=new Node1(99);
        node2.next=n;
        System.out.println("After linked with node 3 checking next"+node2.next);
        System.out.println(n.data);
        System.out.println(node1.next.data);

    }
}
