package com.sotsot.colletions;

import com.sotsot.utils.StringUtils;

public class BTNode implements Comparable<BTNode>{
    private Object element;
    private BTNode left, right, parent;

    public BTNode(){

    }

    public BTNode(Object element){
        this.element = element;
        this.parent = this.left = this.right = null;
    }

    public BTNode(Object element, BTNode parent, BTNode left, BTNode right){
        this.element = element;
        this.parent = parent;
        this.left = left;
        this.right = right;
    }

    public BTNode(Object element, BTNode parent){
        this.element = element;
        this.parent = parent;
        this.left = null;
        this.right = null;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public BTNode getLeft() {
        return left;
    }

    public void setLeft(BTNode left) {
        this.left = left;
    }

    public BTNode getRight() {
        return right;
    }

    public void setRight(BTNode right) {
        this.right = right;
    }

    public BTNode getParent() {
        return parent;
    }

    public void setParent(BTNode parent) {
        this.parent = parent;
    }

    @Override
    public int compareTo(BTNode other) {
        String value1 = this.getElement().toString();
        String value2 = other.getElement().toString();
        if(StringUtils.isNumeric(value1) && StringUtils.isNumeric(value2)){
            if(StringUtils.isInteger(value1) && StringUtils.isInteger(value2))
                return Integer.valueOf(value1).compareTo(Integer.valueOf(value2));
            if(StringUtils.isFloat(value1) && StringUtils.isFloat(value2))
                return Float.valueOf(value1).compareTo(Float.valueOf(value2));
            if(StringUtils.isDouble(value1) && StringUtils.isDouble(value2))
                return Double.valueOf(value1).compareTo(Double.valueOf(value2));
            if(StringUtils.isLong(value1) && StringUtils.isLong(value2))
                return Long.valueOf(value1).compareTo(Long.valueOf(value2));
        }

        return value1.compareTo(value2);
    }

}