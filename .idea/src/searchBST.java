package questions;

public class searchBST {
     public static TreeNode searchBST(TreeNode root, int k){
          if(root==null||root.data==k){
              return root;
          }
          if(root.data<k){
              return searchBST(root.right,k);
          }
          else{
              return searchBST(root.left,k);
          }
     }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(18);

        int k=100;
        TreeNode Result=searchBST(root,k);

        if (Result!=null){
            System.out.println(k + " Key found in BST");
        }
        else {
            System.out.println("key not found in BST");
        }
    }
}
