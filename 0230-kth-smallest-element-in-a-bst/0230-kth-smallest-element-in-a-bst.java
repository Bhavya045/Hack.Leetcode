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
    public void inordertraversal(TreeNode root,List<Integer>v){
        if(root==null){
            return ;
        }
        inordertraversal(root.left,v);
        v.add(root.val);
        inordertraversal(root.right,v);
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer>v=new ArrayList<>();
        inordertraversal(root,v);
        return v.get(k-1);
    }
}