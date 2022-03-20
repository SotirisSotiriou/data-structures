package com.sotsot.colletions;

public class QueueFIFO{
    protected int size;
    protected SNode head;

    public QueueFIFO(){
        size = 0;
        head = null;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return (size < 1);
    }

    public void enqueue(Object element){
        SNode node = new SNode(null, element);
        if(isEmpty()){
            head = node;
        }
        else{
            node.setNext(head);
            head = node;
        }
        size++;
    }

    public SNode dequeue(){
        if(isEmpty()){
            System.out.println("Queue Empty");
            return null;
        }
        SNode temp = head;
        head = head.getNext();
        temp.setNext(null);
        size--;
        return temp;
    }

}