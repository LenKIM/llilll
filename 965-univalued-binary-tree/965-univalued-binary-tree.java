/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 * 12h
 */
class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if (root.right == null && root.left == null) {
            return true;
        }

        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);
        int num = root.val;
        while (!nodes.isEmpty()) {

            TreeNode target = nodes.get(0);

            if (target.val != num) {
                return false;
            }

            if (target.right != null) {
                nodes.add(target.right);
            }

            if (target.left != null) {
                nodes.add(target.left);
            }

            nodes.remove(target);
        }
        return true;
    }
}