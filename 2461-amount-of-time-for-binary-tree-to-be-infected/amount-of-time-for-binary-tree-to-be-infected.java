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
    public int amountOfTime(TreeNode root, int start) {
        Map<TreeNode,TreeNode> parent=new HashMap<>();
        builtParent(root,null,parent);
        Set<TreeNode> visited=new HashSet<>();
        Queue<TreeNode> queue=new LinkedList<>();
        int timeTakentoBurn=-1;
        TreeNode startNode=findStartNode(root,start);
        visited.add(startNode);
        queue.add(startNode);
        while(!queue.isEmpty())
        {
            int size=queue.size();
            for(int i=0;i<size;i++)
            {
                TreeNode current=queue.poll();
                if(current.left!=null && visited.add(current.left))queue.add(current.left);
                if(current.right!=null && visited.add(current.right))queue.add(current.right);
                TreeNode parentNode=parent.get(current);
                if(parentNode!=null && visited.add(parentNode))queue.add(parentNode);
            }
           timeTakentoBurn++; 

        }
        return timeTakentoBurn;
    }
    public TreeNode findStartNode(TreeNode node,int start)
    {
        if(node==null)
        {
            return null;
        }
        if(node.val==start)
        {
            return node;
        }
       TreeNode left=findStartNode(node.left,start);
       if(left!=null)return left;
       return findStartNode(node.right,start);
    }
    public void builtParent(TreeNode node,TreeNode par,Map<TreeNode,TreeNode> parent)
    {
        if(node==null)
        {
            return;
        }
        parent.put(node,par);
        builtParent(node.left,node,parent);
        builtParent(node.right,node,parent);
    } 
}