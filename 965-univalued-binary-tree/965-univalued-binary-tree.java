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

/**
회고 - BST 라고 생각해서 뭔가 회귀이지 않을까 생각했는데,
단순히 순회하는 문제였다.
순회를 어떻게 해야되지? 라는 고민을 하게 되면서 문제를 풀었는데, 큐를 활용해서 순회했다.
맨 앞 값을 꺼내오기 때문에 넓이 우선 탐색으로 한 것으로 판단된다.
근데 만약에 가장 끝에 값을 가져오도록 한다면? 그때부터는 깊이 우선 탐색일 것이다.
**/