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
 */
class Solution {
    public int countNodes(TreeNode root) {
        int cnt=numberOfNodes(root);
        return cnt;
    }
    public int numberOfNodes(TreeNode node)
    {
        if(node==null)
        {
            return 0;
        }
        int left=numberOfNodes(node.left);
        int right=numberOfNodes(node.right);
        return 1+left+right;
    }

}