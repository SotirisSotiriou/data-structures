package com.sotsot.collections;

public class QueueFIFO{
    protected int size;
    protected SNode head;

    public QueueFIFO(){
        size = 0;
        head = null;
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

    
    /** 
     * @return SNode
     */
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