package com.inteview.question.BinaryTree;

import java.util.ArrayList;
import java.util.List;

/*
Brute force logic - recursion
 */
public class BinaryTreeInorderTraversalRecursion {

    static List<Integer> returnVal = new ArrayList<>();

    public static void main(String[] a) {

        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        BinaryTreeInorderTraversalRecursion obj = new BinaryTreeInorderTraversalRecursion();
        obj.inorderTraversal(root);
        returnVal.stream().forEach(s -> System.out.println(s));


    }


    public void inorderTraversal(TreeNode root) {

        if (root != null) {
            inorderTraversal(root.left);
            returnVal.add(root.val);
            inorderTraversal(root.right);

        }
    }

}
