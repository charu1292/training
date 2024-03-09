package questions;


public class searchBT {

    public static BinaryTreeNode searchBT(BinaryTreeNode root,int x){
        if (root==null){
            return null;
        }
        if (root.data==x){
            return root;
        }
        BinaryTreeNode left =searchBT(root.left,x);
        if (left!=null){
            return left;
        }
        return searchBT(root.right,x);

    }

    public static void main(String[] args) {
        BinaryTreeNode root=getBinaryTree();
        int x=100;
        BinaryTreeNode c=searchBT(root,x);
        if(c!=null) {
            if (c.data == x) {
                System.out.println("number is Present ");
            }
        }
        else System.out.println("Number not present ");

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

}
