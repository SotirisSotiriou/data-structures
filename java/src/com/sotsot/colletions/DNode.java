package com.sotsot.colletions;

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

    public Object getElement(){
        return element;
    }

    public DNode getPrev(){
        return prev;
    }

    public DNode getNext(){
        return next;
    }

    public void setElement(Object newElement){
        element = newElement;
    }

    public void setPrev(DNode newPrev){
        prev = newPrev;
    }

    public void setNext(DNode newNext){
        next = newNext;
    }

}
