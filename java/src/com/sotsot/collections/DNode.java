package com.sotsot.collections;

public class DNode {
    private DNode prev, next;
    private Object element;

    public DNode(){
        
    }

    public DNode(DNode nodePrev, DNode nodeNext, Object nodeElement){
        prev = nodePrev;
        next = nodeNext;
        element = nodeElement;
    }

    
    /** 
     * @return Object
     */
    public Object getElement(){
        return element;
    }

    
    /** 
     * @return DNode
     */
    public DNode getPrev(){
        return prev;
    }

    
    /** 
     * @return DNode
     */
    public DNode getNext(){
        return next;
    }

    
    /** 
     * @param newElement
     */
    public void setElement(Object newElement){
        element = newElement;
    }

    
    /** 
     * @param newPrev
     */
    public void setPrev(DNode newPrev){
        prev = newPrev;
    }

    
    /** 
     * @param newNext
     */
    public void setNext(DNode newNext){
        next = newNext;
    }

}
