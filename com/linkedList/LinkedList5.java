package com.linkedList;

public class LinkedList5 {
    public static void main(String[] args) {
        Node5 node= new Node5(10);
        System.out.println("data printing "+node.data);
        System.out.println("Checking next NOde "+node.next);

        Node5 node2=new Node5(20);
       // System.out.println("22 checking node2 next "+node.next);
        node.next=node2;
        System.out.println("After linking checking next "+node.next);
        System.out.println("2 checking node2 next next"+node.next.next);
        System.out.println("2 checking node2 data "+node2.data);
        Node5 node3=new Node5(60);
        node2.next=node3;
        System.out.println(node.next.next);
    }
    Node5 head;

    public  void addOnFront(int x){
        Node5 newnode=new Node5(x);
        if(head ==null){
            head=newnode.next;

        }
    }
}
class Node5{
    public int data;
    public Node5 next;
    public Node5(int data){
        this.data=data;
        this.next=null;
    }
}
