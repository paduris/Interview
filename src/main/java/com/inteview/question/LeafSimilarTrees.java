//package com.inteview.question;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class LeafSimilarTrees {
//    public static void main(String[] a) {
//
//        TreeNode root1 = populateRoot1();
//        TreeNode root2 = populateRoot1();
//        System.out.println(leavesSimilar(root1, root2));
//    }
//
//    private static TreeNode populateRoot1() {
//        TreeNode root = new TreeNode(3);
//
//        TreeNode rl1 = new TreeNode(5);
//        TreeNode rr2 = new TreeNode(1);
//        root.left = rl1;
//        root.right = rr2;
//
//        TreeNode rll1 = new TreeNode(6);
//        TreeNode rlr2 = new TreeNode(2);
//        rl1.left = rll1;
//        rl1.right = rlr2;
//
//        TreeNode rlll1 = new TreeNode(7);
//        TreeNode rllr2 = new TreeNode(4);
//        rlr2.left = rlll1;
//        rlr2.right = rllr2;
//
//
//        TreeNode rrl1 = new TreeNode(9);
//        TreeNode rrr2 = new TreeNode(8);
//
//        rr2.left = rrl1;
//        rr2.right = rrr2;
//        return root;
//    }
//
//
//    public static boolean leavesSimilar(TreeNode root1, TreeNode root2) {
//        List<Integer> leaves = new ArrayList<>();
//        List<Integer> leaves1 = findLeaves(root1, leaves);
//        List<Integer> leaves2 = findLeaves(root2, leaves);
//        leaves1.stream().forEach(a -> System.out.println(a));
//        return false;
//    }
//
//    private static List<Integer> findLeaves(TreeNode currentNode, List<Integer> leaves) {
//
//        if (currentNode == null) {
//            return null;
//        }
//        if (currentNode.left == null && currentNode.right == null) {
//            leaves.add(currentNode.val);
//        } else {
//            findLeaves(currentNode.left, leaves);
//            findLeaves(currentNode.right, leaves);
//        }
//        return leaves;
//    }
//}
//
