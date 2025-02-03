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
    public int height(TreeNode root, int[] depth)
    {
        if(root==null)
          return 0;
        int lh=height(root.left,depth);
        int rh=height(root.right,depth);
        depth[0]=Math.max(lh,rh);
        return 1+Math.max(lh,rh);
        
    }
    public int maxDepth(TreeNode root) {
        int depth[]=new int[1];
        depth[0]=height(root,depth);
        return depth[0];
    }
}