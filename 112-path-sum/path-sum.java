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
    public boolean hasPathSum(TreeNode root, int targetSum) {
       if(root==null)
       {
         return false;
       }
       if(isLeafNode(root) && targetSum==root.val)
       {
         return true;
       }
       return hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val);
    }
    public boolean isLeafNode(TreeNode root)
    {
        if(root.right==null && root.left==null)
        {
            return true;
        }
        return false;
    }
}