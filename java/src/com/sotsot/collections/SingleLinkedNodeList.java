package com.sotsot.collections;

public class SingleLinkedNodeList {
    protected int nofelements;
    protected SNode head, tail;

    public SingleLinkedNodeList(){
        nofelements = 0;
        head = tail = null;
    }

    
    /** 
     * @return int
     */
    public int size(){
        return nofelements;
    }

    
    /** 
     * @return boolean
     */
    public boolean isEmpty(){
        return (nofelements < 1);
    }

    public void setEmpty(){
        nofelements = 0;
        head = tail = null;
    }

    
    /** 
     * @param v
     * @return boolean
     */
    public boolean isFirst(SNode v){
        return v == head;
    }

    
    /** 
     * @return SNode
     */
    public SNode first(){
        if(isEmpty()){
            System.out.println("List is empty...");
        }
        return head;
    }

    
    /** 
     * @return SNode
     */
    public SNode last(){
        if(isEmpty()){
            System.out.println("List is empty...");
        }
        return tail;
    }

    
    /** 
     * @param p
     * @param element
     * @return SNode
     */
    //insert element after node p and return new node
    public SNode insertAfter(SNode p, Object element){
        if(isEmpty()){
            System.out.println("List is empty, adding element to list...");
            return null;
        }
        nofelements++;
        SNode q = new SNode(p.getNext(), element);
        if(p.getNext() == null){
            tail = q;
        }
        p.setNext(q);
        return q;
    }

    
    /** 
     * @param p
     * @return SNode
     */
    public SNode deleteAfter(SNode p){
        if(p == tail){
            System.out.println("Last element has not next...");
            return null;
        }
        SNode pNext = p.getNext();
        nofelements--;
        p.setNext(pNext.getNext());
        if(pNext == tail){
            tail = p;
        }
        pNext.setNext(null);
        return pNext;
    }

    
    /** 
     * @param s
     */
    //catenate 2 SinglyNodeLists
    public void catenate(SingleLinkedNodeList s){
        if(s.isEmpty()){
            return;
        }

        if(tail == null){
            tail = s.first();
        }
        else{
            tail.setNext(s.first());
        }

        if(isEmpty()){
            head = tail;
        }

        tail = s.last();
        nofelements += s.size();
        s.setEmpty();
    }
}
