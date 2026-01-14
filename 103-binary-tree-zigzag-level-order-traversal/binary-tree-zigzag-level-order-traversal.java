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
        boolean leftToRight=true;
        List<List<Integer>> result=new ArrayList<>();
        Deque<TreeNode> q=new LinkedList<>();
        if(root==null)
        {
            return result;
        }
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            List<Integer> level=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                if(leftToRight)
                {
                  TreeNode curr=q.pollFirst();
                  level.add(curr.val);
                  if(curr.left!=null)q.addLast(curr.left);
                  if(curr.right!=null)q.addLast(curr.right);
                }
                else
                {
                  TreeNode curr=q.pollLast();
                  level.add(curr.val);
                  if(curr.right!=null)q.addFirst(curr.right);
                  if(curr.left!=null)q.addFirst(curr.left);
                }

            }
            leftToRight=!leftToRight;
            result.add(level);      
        }
        return result;
    }
}