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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null)
        {
            return result;
        }
        queue.add(root);
        boolean leftToRight=true;
        while(!queue.isEmpty())
        {
            List<Integer> level=new ArrayList<>();
            int len=queue.size();
            for(int i=0;i<len;i++)
            {
                TreeNode current=queue.poll();
                if(leftToRight)
                {
                     level.add(current.val);
                }
                else
                {
                    level.add(0,current.val);

                }

                if(current.left!=null)queue.add(current.left);
                if(current.right!=null)queue.add(current.right);
            }
            leftToRight=!leftToRight;
            result.add(level);

        }
        return result;
    }
}