package com.linkedList;

public class LL {
    private int size;
    LL(){
        size=0;
    }

    public void addinToFirst(int x){
        Node newNode=new Node(x);
        if (head==null){
            head=newNode;
           // newNode=head;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data) {
        Node newNode = new Node(data);


        if(head == null) {
            head = newNode;
            return;
        }


        Node lastNode = head;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
        }


        lastNode.next = newNode;

    }


    public void print(){
        Node temp=head;
        if(temp==null){
            System.out.println("Linked List is empty");
        }
        while(temp !=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;

        }
        System.out.print("null");
    }
    public void deletefirst(){
        if(head==null){
            System.out.println("Head is empty");
            return;
        }
        head=this.head.next;
        size--;
    }

    public static void main(String[] args) {
        LL l= new LL();
        l.addinToFirst(99);
        l.addinToFirst(999);
        System.out.println(l.size);
        l.addLast(10);
        l.addLast(45);
        l.addLast(77);
        System.out.println(l.size);
        l.deletefirst();
        System.out.println(l.size);


        l.print();
    }

    Node head;
    class Node{
        int data;
        Node next;
        public Node(int data){
            this .data=data;
            this.next=null;
            size++;
        }

    }
}
