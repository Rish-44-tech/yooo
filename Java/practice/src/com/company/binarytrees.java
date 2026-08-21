package com.company;


// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class binarytrees {
    public static boolean checkTree(TreeNode root){
        return (root.val==root.left.val+root.right.val);
    }
    public static void main(String[] args) {
        TreeNode left=new TreeNode(4);
        TreeNode right=new TreeNode(6);
        TreeNode root=new TreeNode(11,left,right);
        boolean ans=checkTree(root);
        System.out.println(ans);
    }



}
