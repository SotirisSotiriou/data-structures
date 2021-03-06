package com.sotsot.collections;

public class LinkedBinaryTree {
    private BTNode root;
    private int size;
    

    public LinkedBinaryTree(){
        root = null;
        size = 0;
    }

    public LinkedBinaryTree(BTNode root){
        this.root = root;
        size = 1;
    }

    public LinkedBinaryTree(Object element){
        root = new BTNode(element, null, null, null);
        size = 1;
    }

    
    /** 
     * @return int
     */
    public int size(){
        return size;
    }

    
    /** 
     * @return BTNode
     */
    public BTNode root(){
        return root;
    }

    
    /** 
     * @param node
     */
    public void setRoot(BTNode node){
        root = node;
    }

    
    /** 
     * @param node
     * @return boolean
     */
    public boolean isRoot(BTNode node){
        return (node == root);
    }

    
    /** 
     * @param node
     * @return boolean
     */
    public boolean isLeft(BTNode node){
        if(node == root){
            System.out.println("Node is root");
            return false;
        }
        return (node == node.getParent().getLeft());
    }

    
    /** 
     * @param node
     * @return boolean
     */
    public boolean isRight(BTNode node){
        if(node == root){
            System.out.println("Node is root");
            return false;
        }
        return (node == node.getParent().getLeft());
    }

    
    /** 
     * @param node
     */
    public void addElement(BTNode node){
        BTNode current = root;
        while(true){
            if(current.getLeft() == null && node.compareTo(current) <= 0){
                node.setParent(current);
                node.getParent().setLeft(node);
                break;
            }
            else if(current.getRight() == null && node.compareTo(current) > 0){
                node.setParent(current);
                node.getParent().setRight(node);
                break;
            }

            if(node.compareTo(current) <= 0){
                current = current.getLeft();
            }
            else{
                current = current.getRight();
            }
        }
        size++;
    }

    
    /** 
     * @param v
     * @param w
     */
    public void exchangeElement(BTNode v, BTNode w){
        Object temp = v.getElement();
        v.setElement(w.getElement());
        w.setElement(temp);
    }

    
    /** 
     * @param node
     * @return BTNode
     */
    public BTNode getSibling(BTNode node){
        if(isRoot(node) || node == null){
            System.out.println("No sibling");
            return null;
        }

        if(isRight(node)){
            return node.getParent().getLeft();
        }
        else{
            return node.getParent().getRight();
        }
    }

    
    /** 
     * @param node
     */
    public static void printLUR(BTNode node){
        if(node == null){
            return;
        }
        
        printLUR(node.getLeft());
        System.out.println(node.getElement().toString().concat(" "));
        printLUR(node.getRight());
    }

}
