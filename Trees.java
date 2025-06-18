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
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            
            return newNode;
        }
        //Preorder Traversal 
        public static void preorder(Node root){
            if(root == null){
                System.out.println(-1 + "->Preorder Traversal");
                return;
            }
            System.out.println(root.data + "->Preorder Traversal");
            preorder(root.left);
            preorder(root.right);
        }
        
        //InOrder Traversal
        public static void Inorder(Node root){
            if(root==null){
                return;
            }
            Inorder(root.left);
            System.out.println(root.data + "  --->InOrder Traversal     ");
            Inorder(root.right);
        }
        
        // PostOrder Traversal
        public static void Postorder(Node root){
            if(root==null){
                return;
                
            }
              Postorder(root.left);
              Postorder(root.right);
              System.out.println(root.data);
      
        }
        //LevelOrder Traversal
        public static void levelorder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            
            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode==null){
                    System.out.println( );
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data + " ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
            
        }
        
    }
    
    public static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // BinaryTree tree = new BinaryTree();
        // Node root = tree.buildTree(nodes);
        Node root = BinaryTree.buildTree(nodes);
        // BinaryTree.preorder(root);
        // BinaryTree.Inorder(root);
        // BinaryTree.Postorder(root);
        BinaryTree.levelorder(root);

        // System.out.println(root.data);
    }
}
