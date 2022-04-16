
import com.sotsot.collections.*;

public class App {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        LinkedBinaryTree tree = new LinkedBinaryTree(new BTNode(20));
        tree.addElement(new BTNode(10));
        tree.addElement(new BTNode(12));
        tree.addElement(new BTNode(14));
        tree.addElement(new BTNode(3));
        tree.addElement(new BTNode(25));
        tree.addElement(new BTNode(22));
        tree.addElement(new BTNode(21));
        LinkedBinaryTree.printLUR(tree.root());

    }

    
    /** 
     * @param dList
     */
    public static void printList(DoubleLinkedNodeList dList){
        DNode current = dList.first();
        System.out.println(current.getElement().toString());
        for(int i=1; i<dList.size(); i++){
            current = current.getNext();
            System.out.println(current.getElement().toString());
        }
    }
}
