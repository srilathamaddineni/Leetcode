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
    public boolean result=true;
    public boolean isBalanced(TreeNode root) {
        if(root==null)
        {
            return true;
        }
      heightOfTree(root);
      return result;
    }
    public int heightOfTree(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int left=heightOfTree(root.left);
        int right=heightOfTree(root.right);
        if(Math.abs(left-right)>1)
        {
            result=false;
        }
        return 1+Math.max(left,right);
    }
}