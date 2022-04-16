package com.sotsot.collections;

public class LinkedStack {
    private SNode top;
    private int size;

    public LinkedStack(){
        top = null;
        size = 0;
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
     * @return SNode
     */
    public SNode top(){
        return top;
    }

    
    /** 
     * @param element
     */
    public void push(Object element){
        SNode node = new SNode(top, element);
        top = node;
        size++;
    }

    
    /** 
     * @return SNode
     */
    public SNode pop(){
        if(isEmpty()){
            System.out.println("Stack Empty");
            return null;
        }
        SNode oldtop = top;
        top = top.getNext();
        oldtop.setNext(null);
        size--;
        return oldtop;
    }

}
