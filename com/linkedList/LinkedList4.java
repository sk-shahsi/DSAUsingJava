package com.linkedList;

public class LinkedList4 {
    Node4 head;
    public void addIntoLast(int x){
        Node4 n=new Node4(x);
            if(head ==null){
                head=n;
                return;
            }
        Node4 currentNode=head;
            while(currentNode.next !=null){
                currentNode=currentNode.next;


            }
        currentNode.next=n;


    }
    public void print(){
        Node4 temp=head;
        if(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList4 l=new LinkedList4();
        l.addIntoLast(100);
        l.addIntoLast(20);
        l.addIntoLast(40);
        l.print();
    }
}
