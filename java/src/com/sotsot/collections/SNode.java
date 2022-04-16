package com.sotsot.collections;

//used for SingleLinkedNodeList and LinkedStack
public class SNode {
    private SNode next;
    private Object element;

    public SNode(SNode nodeNext, Object nodeElement){
        this.next = nodeNext;
        this.element = nodeElement;
    }

    
    /** 
     * @return Object
     */
    public Object getElement(){
        return this.element;
    }

    
    /** 
     * @return SNode
     */
    public SNode getNext(){
        return this.next;
    }

    
    /** 
     * @param newElement
     */
    public void setElement(Object newElement){
        this.element = newElement;
    }

    
    /** 
     * @param newNext
     */
    public void setNext(SNode newNext){
        this.next = newNext;
    }

}
