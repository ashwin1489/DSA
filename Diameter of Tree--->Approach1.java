// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

public class BinaryTreesB{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
      public static int height(Node root){
            if(root == null){
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh,rh) +1 ;
        }
    public static int diameter(Node root){
        if (root ==null){
            return 0;
        }
        int ld = diameter(root.left);
        int lheight = height(root.left);
        int rd = diameter(root.right);
        int rheight = height(root.right);
        int self = lheight + rheight + 1;
        return Math.max(self,Math.max(ld,rd));
    }
    public static void main(String args[]){
       
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right  = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        System.out.println(diameter(root));


    }
}
