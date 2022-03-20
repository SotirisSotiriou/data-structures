package com.sotsot.colletions;

public class LinkedStack {
    private SNode top;
    private int size;

    public LinkedStack(){
        top = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return (size < 1);
    }

    public SNode top(){
        return top;
    }

    public void push(Object element){
        SNode node = new SNode(top, element);
        top = node;
        size++;
    }

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
