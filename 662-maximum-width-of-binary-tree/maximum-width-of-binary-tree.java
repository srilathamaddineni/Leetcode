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

class Pair{
    TreeNode node;
    int idx;
    Pair(TreeNode node,int idx)
    {
        this.node=node;
        this.idx=idx;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        Queue<Pair> queue=new LinkedList<>();
        int maxWidth=Integer.MIN_VALUE;
        queue.add(new Pair(root,0));
        while(!queue.isEmpty())
        {
            int levelLength=queue.size();
            int startAt=queue.peek().idx;
            int index=0;
            for(int i=0;i<levelLength;i++)
            {
               Pair p=queue.poll();
               TreeNode current=p.node;
               index=p.idx;
               if(current.left!=null)queue.add(new Pair(current.left,2*index+1));
               if(current.right!=null)queue.add(new Pair(current.right,2*index+2));
            }
            maxWidth=Math.max(maxWidth,index-startAt+1);
        }
        return maxWidth;
        
    }
}