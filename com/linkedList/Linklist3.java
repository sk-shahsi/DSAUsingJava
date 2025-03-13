package com.linkedList;

public class Linklist3 {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }




    }
    Node head;
    public void addintofirst(int x){
        Node newNode= new Node(x);
        newNode.next=head;
        head=newNode;
    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print("<--"+temp.data);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Linklist3 ff= new Linklist3();
        ff.addintofirst(5);
        ff.addintofirst(6);
        ff.addintofirst(7);
        ff.addintofirst(8);
        ff.addintofirst(10);
        ff.addintolast(55);
        ff.addintolast(66);
        ff.print();




    }
    public void addintolast(int y){
        Node newNode= new Node(y);
        if(head==null){
            head=newNode;
            newNode=head;
            return;
        }
        Node curentNode=head;
        while (curentNode.next!=null){
            curentNode=curentNode.next;

        }
        curentNode=newNode;
    }

}
