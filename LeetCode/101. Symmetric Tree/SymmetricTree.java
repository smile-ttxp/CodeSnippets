package _101_symmetric_tree;

/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 *
 * For example, this binary tree is symmetric:
 *
 *      1
 *     / \
 *    2   2
 *   / \ / \
 *  3  4 4  3
 * But the following is not:
 *      1
 *     / \
 *    2   2
 *     \   \
 *      3    3
 * Note:
 * Bonus points if you could solve it both recursively and iteratively.
 *
 * OJ's Binary Tree Serialization:
 * The serialization of a binary tree follows a level order traversal, where '#' signifies a path terminator where no node exists below.
 *
 * Here's an example:
 *     1
 *    / \
 *   2   3
 *      /
 *     4
 *      \
 *       5
 * The above binary tree is serialized as "{1,2,3,#,#,4,#,#,5}".
 */
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null && rightNode == null) {
            return true;
        }
        if (leftNode == null || rightNode == null) {
            return false;
        }
        if (leftNode.val != rightNode.val) {
            return false;
        }
        return isSymmetric(leftNode.left, rightNode.right) && isSymmetric(leftNode.right, rightNode.left);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
        }
    }
}
