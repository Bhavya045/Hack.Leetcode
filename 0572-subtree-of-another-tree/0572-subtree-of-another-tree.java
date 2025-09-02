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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        String fulltree=preordertraversal(root);
        String subtree= preordertraversal(subRoot);

        return fulltree.contains(subtree);
    }
    String preordertraversal(TreeNode root){
        if(root==null){
            return null;
        }
        StringBuilder sb= new StringBuilder("^");
        sb.append(root.val);
        sb.append(preordertraversal(root.left));
         sb.append(preordertraversal(root.right));

         return sb.toString();


    }
}