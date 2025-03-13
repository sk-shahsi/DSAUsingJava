package com.linkedList;

public  class linkedList2 {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this .data=data;
            this.next=null;
        }
    }
    Node head;
    public  Node addDataintoFront(int x) {

        Node newnode= new Node(x);
        newnode.next=head;
        head=newnode;
        return newnode;
    }

    public static void main(String[] args) {
        linkedList2 c= new linkedList2();
        c.addDataintoFront(5);
        c.addDataintoFront(6);
        c.addDataintoFront(7);
        c.addDataintoFront(8);
        c.addDataintoFront(9);
        c.print();


    }
    public void print(){
        Node temp=head;
        while (temp!=null){
            System.out.print("<-"+temp.data);
            temp=temp.next;
        }
    }



}

