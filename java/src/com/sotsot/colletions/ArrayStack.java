package com.sotsot.colletions;

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

    public Object top(){
        if(isEmpty()){
            System.out.println("Stack Empty");
            return null;
        }
        return stack[top];
    }

    public int size(){
        return top+1;
    }

    public boolean isEmpty(){
        return (top < 0);
    }

    public void push(Object o){
        if(size() == capacity){
            System.out.println("Stack Full");
            return;
        }

        stack[++top] = o;
    }

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
