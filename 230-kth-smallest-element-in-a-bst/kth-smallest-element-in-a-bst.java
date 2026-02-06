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
    List<Integer> result=new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> result=new ArrayList<>();
        storeElements(root,result);
        Collections.sort(result);
        return result.get(k-1);
    }
    public List<Integer> storeElements(TreeNode root,List<Integer> result)
    {
        if(root==null)
        {
            return result;
        }
        storeElements(root.left,result);
        result.add(root.val);
        storeElements(root.right,result);
        return result;
    }
}