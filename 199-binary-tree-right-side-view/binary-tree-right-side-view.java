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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null)
        {
            return result;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            int flag=0;
            while(size>0)
            {
                TreeNode current=queue.poll();
                if(current.right!=null)queue.add(current.right);
                if(current.left!=null)queue.add(current.left);
                if(flag==0){
                    result.add(current.val);
                    flag=1;
                }
                size--;
            }          
        }
        return result;
    }
}