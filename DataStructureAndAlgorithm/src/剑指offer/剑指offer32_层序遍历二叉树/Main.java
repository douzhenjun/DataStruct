package 剑指offer.剑指offer32_层序遍历二叉树;

import 二叉树.二叉树节点类.TreeNode;

public class Main {

    public static void main(String[] args) {
        /**
         *           8
         *        6     10
         *      5   7 9     11
         */
        TreeNode root = new TreeNode(8);
        root.setLeft(new TreeNode(6));
        root.setRight(new TreeNode(10));
        root.getLeft().setLeft(new TreeNode(5));
        root.getLeft().setRight(new TreeNode(7));
        root.getRight().setLeft(new TreeNode(9));
        root.getRight().setRight(new TreeNode(11));

        PrintByFloor.printTreeNode(root);
    }
}
