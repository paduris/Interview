package com.inteview.question.BinaryTree;

import java.util.ArrayList;
import java.util.List;


public class BinaryTreePreorderTraversal {


    List<TreeNode> treeNodes = new ArrayList<>();

    public static void main(String a[]) {


    }


    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> treeNodes = new ArrayList<>();
        preorderTraversalHelper(treeNodes, root);
        return treeNodes;
    }


    private void preorderTraversalHelper(List<Integer> treeNodes, TreeNode root) {

        if (root != null) {
            treeNodes.add(root.val);

            preorderTraversalHelper(treeNodes, root.left);
            preorderTraversalHelper(treeNodes, root.right);
        }
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}