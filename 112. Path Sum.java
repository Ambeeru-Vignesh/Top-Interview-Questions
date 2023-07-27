/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return createSum(root, 0, targetSum);
    }

    public boolean createSum(TreeNode node, int runningSum, int target) {
        if (node == null) {
            return false;
        }

        int sum = runningSum + node.val;

        if (node.left == null && node.right == null) {
            return sum == target;
        }

        return createSum(node.left, sum, target) || createSum(node.right, sum, target);
    }
}
