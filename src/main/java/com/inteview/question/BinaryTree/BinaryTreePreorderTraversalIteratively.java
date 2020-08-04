package com.inteview.question.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversalIteratively {


    public static void main(String[] a) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        BinaryTreePreorderTraversalIteratively obj = new BinaryTreePreorderTraversalIteratively();
        List<Integer> results = obj.preorderTraversal(root);

        results.forEach(s -> System.out.println(s));
    }


    private List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> preorder = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode x = stack.pop();

            if (x == null) {
                continue;
            }

            preorder.add(x.val);
            stack.push(x.right);
            stack.push(x.left);

        }
        return preorder;
    }
}