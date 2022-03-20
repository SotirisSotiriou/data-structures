package com.sotsot.colletions;

//used for SingleLinkedNodeList and LinkedStack
public class SNode {
    private SNode next;
    private Object element;

    public SNode(SNode nodeNext, Object nodeElement){
        this.next = nodeNext;
        this.element = nodeElement;
    }

    public Object getElement(){
        return this.element;
    }

    public SNode getNext(){
        return this.next;
    }

    public void setElement(Object newElement){
        this.element = newElement;
    }

    public void setNext(SNode newNext){
        this.next = newNext;
    }

}
