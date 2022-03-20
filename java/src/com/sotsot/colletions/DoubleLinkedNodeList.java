package com.sotsot.colletions;


public class DoubleLinkedNodeList {
    protected int nofelements;
    protected DNode head, tail;

    public DoubleLinkedNodeList() {
        nofelements = 0;
        head = new DNode(null, null, null);
        tail = new DNode(null, null, null);
        head.setNext(tail);
    }

    public DoubleLinkedNodeList(Object[] elements){
        head = new DNode(null,null,null);
        tail = new DNode(null,null,null);
        if(elements.length == 0){
            head.setNext(tail);
            return;
        }
        
        nofelements = elements.length;

        DNode current = new DNode(head, null, null);
        head.setNext(current);

        DNode next = new DNode();
        for(int i=0; i<elements.length; i++){
            current.setElement(elements[i]);
            next = new DNode(current, null, null);
            current.setNext(next);
            current = next;
        }
        tail = next;


    }

    public int size(){
        return nofelements;
    }

    public boolean isEmpty(){
        return (nofelements < 1);
    }

    public boolean isFirst(DNode node){
        return (node.getPrev() == head);
    }

    public boolean isLast(DNode node){
        return (node.getNext() == tail);
    }

    public DNode first(){
        if(isEmpty()){
            System.out.println("List is empty...");
            return head;
        }
        return (head.getNext());
    }

    public DNode last(){
        if(isEmpty()){
            System.out.println("List is empty...");
            return tail;
        }
        return (tail.getPrev());
    }

    public DNode getNodeAtIndex(int index){
        DNode node = head;
        int count = 0;
        while(count < index && count < size()){
            node.getNext();
            count++;
        }
        if(count == index)
            node = node.getNext();
        else{
            System.out.println("Index must be smaller than list size...");
            return null;
        }
        return node;
    }

    public DNode insertBefore(DNode p, Object element){
        nofelements++;
        DNode q = new DNode();
        if(p == head){
            q = new DNode(head, head.getNext(), element);
            head.getNext().setPrev(q);
            head.setNext(q);
        }
        else{
            q = new DNode(p.getPrev(), p, element);
            p.getPrev().setNext(q);
            p.setPrev(q);
        }
        return q;
    }

    public DNode insertAfter(DNode p, Object element){
        nofelements++;
        DNode q = new DNode();
        if(p == tail){
            q = new DNode(tail.getPrev(), tail, element);
            tail.getPrev().setNext(q);
            tail.setPrev(q);
        }
        else{
            q = new DNode(p, p.getNext(), element);
            p.getNext().setPrev(q);
            p.setNext(q);
        }
        return q;
    }

    public DNode deleteNode(DNode p){
        if((p == head) || (p == tail)){
            System.out.println("Empty list...");
            return null;
        }
        nofelements--;
        p.getPrev().setNext(p.getNext());
        p.getNext().setPrev(p.getPrev());
        p.setPrev(null);
        p.setNext(null);
        return p;
    }


    public DNode deleteNodeAtIndex(int index){
        if(index > size()) return null;
        int count = 0;
        DNode node = first();
        while(count < index){
            count++;
            node = node.getNext();
        }
        node.getPrev().setNext(node.getNext());
        node.getNext().setPrev(node.getPrev());
        node.setPrev(null);
        node.setNext(null);
        return node;
    }

    public void addNodeAtIndex(DNode p, int index){
        if(index > size()){
            System.out.println("Index must be smaller than size...");
            return;
        }
        int count = 0;
        DNode node = head;
        while(count < index){
            count++;
            node = node.getNext();
        }
        node.getPrev().setNext(p);
        node.getNext().setPrev(p);
        p.setPrev(node.getPrev());
        p.setNext(node.getNext());
    }
}
