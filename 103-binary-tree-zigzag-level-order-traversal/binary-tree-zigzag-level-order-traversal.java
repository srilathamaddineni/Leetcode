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
        List<List<Integer>> zigzagList=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null)
        {
            return zigzagList;
        }
        queue.add(root);
        int flag=0;
        while(!queue.isEmpty())
        {
            List<Integer> li=new ArrayList<>();
            int len=queue.size();
            for(int i=0;i<len;i++)
            {
                TreeNode node=queue.poll();
                li.add(node.val);
                if(node.left!=null)
                {
                    queue.add(node.left);
                }
                if(node.right!=null)
                {
                    queue.add(node.right);
                }
            }
             if(flag==0)
            {
                flag=1;
            }
            else
            {
                flag=0;
                Collections.reverse(li);
            }
            zigzagList.add(li);

        }
        return zigzagList;
    }
}