/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode,TreeNode> parent=new HashMap<>();
        buildParent(root,null,parent);
        Queue<TreeNode> queue=new LinkedList<>();
        Set<TreeNode> visited=new HashSet<>();
        List<Integer> result=new ArrayList<>(); 
        queue.add(target);
        visited.add(target);
        int distance=0;
        while(!queue.isEmpty())
        {
            int size=queue.size();
            if(distance==k)
            {
                break;
            }
            for(int i=0;i<size;i++)
            {
                TreeNode current=queue.poll();
                if(current.left!=null && visited.add(current.left))queue.add(current.left);
                if(current.right!=null && visited.add(current.right))queue.add(current.right);
               if(parent.get(current)!=null && visited.add(parent.get(current)))queue.add(parent.get(current));
            }
            distance++;

        }
        while(!queue.isEmpty())
        {
            TreeNode currentNode=queue.poll();
            result.add(currentNode.val);
        }
        return result;
    }
    void buildParent(TreeNode node,TreeNode par,Map<TreeNode,TreeNode> parent)
    {
        if(node==null)return;
        parent.put(node,par);
        buildParent(node.left,node,parent);
        buildParent(node.right,node,parent);
    }
}