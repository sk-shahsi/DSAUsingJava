package com.linkedList;

public class LinkedList6 {
    Node66 head;
    public  void adddataintoFront(int x){
        Node66 newNode=new Node66(x);
        if(head == null){
            head=newNode;
            newNode=head;
        }
        head.next=newNode;
        newNode=head;

    }
    public void print(){
        Node66 temp=head;
        if (temp !=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList6 l=new LinkedList6();
        l.adddataintoFront(5);
        l.adddataintoFront(9);
        l.print();
    }
}
class Node66{
    public int data;
    public Node66 next;

    public Node66(int data){
        this.data=data;
        this.next=null;
    }
}
