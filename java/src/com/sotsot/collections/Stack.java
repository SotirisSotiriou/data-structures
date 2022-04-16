package com.sotsot.collections;

import java.util.ArrayList;

public class Stack {
    private int nofelements;
    private ArrayList<Object> elements;

    public Stack(){
        nofelements = 0;
        elements = new ArrayList<Object>();
    }

    public Stack(Object[] elements){
        this.elements = new ArrayList<Object>();
        for(Object element : elements){
            push(element);
        }
    }

    
    /** 
     * @return int
     */
    public int size(){
        return nofelements;
    }

    
    /** 
     * @return Object
     */
    public Object top(){
        return elements.get(nofelements-1);
    }

    
    /** 
     * @param element
     */
    public void push(Object element){
        elements.add(element);
        nofelements++;
    }

    
    /** 
     * @return Object
     */
    public Object pop(){
        Object elementToPop = elements.get(elements.size()-1);
        elements.remove(nofelements-1);
        nofelements--;
        return elementToPop;
    }
}
