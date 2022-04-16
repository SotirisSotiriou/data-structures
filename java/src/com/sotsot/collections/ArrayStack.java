package com.sotsot.collections;

public class ArrayStack {
    public static final int defaultCapacity = 1000;
    private int capacity;
    private Object stack[];
    private int top = -1;

    public ArrayStack(){
        this.capacity = defaultCapacity;
        this.stack = new Object[capacity];
    }

    public ArrayStack(int cap){
        this.capacity = cap;
        this.stack = new Object[capacity];
    }

    
    /** 
     * @return Object
     */
    public Object top(){
        if(isEmpty()){
            System.out.println("Stack Empty");
            return null;
        }
        return stack[top];
    }

    
    /** 
     * @return int
     */
    public int size(){
        return top+1;
    }

    
    /** 
     * @return boolean
     */
    public boolean isEmpty(){
        return (top < 0);
    }

    
    /** 
     * @param o
     */
    public void push(Object o){
        if(size() == capacity){
            System.out.println("Stack Full");
            return;
        }

        stack[++top] = o;
    }

    
    /** 
     * @return Object
     */
    public Object pop(){
        if(isEmpty()){
            System.out.println("Stack Empty");
            return null;
        }
        Object element = stack[top];
        stack[top--] = null;
        return element;
    }

    
}
