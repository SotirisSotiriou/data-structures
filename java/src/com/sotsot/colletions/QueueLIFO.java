package com.sotsot.colletions;

public class QueueLIFO {
    protected int size;
    protected SNode head, rear;

    public QueueLIFO(){
        size = 0;
        head = null;
        rear = null;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return (size < 1);
    }

    public void enqueue(Object element){
        SNode node = new SNode(null,element);
        if(isEmpty()){
            head = rear = node;
        }
        else{
            rear.setNext(node);
            rear = rear.getNext();
        }
        size++;
    }

    public SNode dequeue(){
        if(isEmpty()){
            System.out.println("Stack Empty");
            return null;
        }
        SNode temp = head;
        head = head.getNext();
        size--;
        if(isEmpty()) rear = head = null;
        return temp;
    }
}
