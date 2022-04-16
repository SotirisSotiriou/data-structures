package com.sotsot.collections;

public class QueueLIFO {
    protected int size;
    protected SNode head, rear;

    public QueueLIFO(){
        size = 0;
        head = null;
        rear = null;
    }

    
    /** 
     * @return int
     */
    public int size(){
        return size;
    }

    
    /** 
     * @return boolean
     */
    public boolean isEmpty(){
        return (size < 1);
    }

    
    /** 
     * @param element
     */
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

    
    /** 
     * @return SNode
     */
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
