package questions;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {


    public static void preorder(BinaryTreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }

    public static void inorder(BinaryTreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }

    public static void postorder(BinaryTreeNode root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");

    }

    public static void levelorder(BinaryTreeNode root){
        if(root==null)
        {
            return;
        }
        Queue<BinaryTreeNode> Q=new LinkedList<>();
        Q.offer(root);
        while(!Q.isEmpty()){
            BinaryTreeNode node=Q.poll();
            System.out.print(node.data + " ");
            if(node.left!=null){
                Q.offer(node.left);

            }
            if(node.right!=null){
                Q.offer(node.right);
            }


        }

    }

    public static BinaryTreeNode getBinaryTree(){
        BinaryTreeNode root=new BinaryTreeNode(1);
        root.left= new BinaryTreeNode(5);
        root.right=new BinaryTreeNode(7);
        root.left.left =new BinaryTreeNode(8);
        root.left.right=new BinaryTreeNode(10);
        root.right.left=new BinaryTreeNode(6);
        root.right.right =new BinaryTreeNode(7);

        return root;

    }

    public static void main(String[] args) {
        BinaryTreeNode root=getBinaryTree();
        preorder(root);
        System.out.println("");
        inorder(root);
        System.out.println("");
        postorder(root);
        System.out.println("");
        levelorder(root);

    }

}
class BinaryTreeNode {
        int data;
       BinaryTreeNode left;
        BinaryTreeNode right;
        public BinaryTreeNode(int data) {
            this.data = data;
        }
    }

