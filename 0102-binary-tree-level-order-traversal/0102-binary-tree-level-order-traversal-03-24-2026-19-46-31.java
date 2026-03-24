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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> wrap=new ArrayList<>();
        if (root == null) return wrap;
        queue.offer(root);

        while(!queue.isEmpty()){
            List<Integer> ls=new ArrayList<>();
            int levelNum = queue.size();
            for(int i=0;i<levelNum;i++){
                TreeNode temp=queue.poll();
                if(temp.left!=null) queue.offer(temp.left);
                if(temp.right!=null) queue.offer(temp.right);

                ls.add(temp.val);
            }

            wrap.add(ls);
        }
        return wrap;
    }
}