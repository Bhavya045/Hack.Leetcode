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
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        int level=0;
        Stack<TreeNode>main=new Stack<>();
        Stack<TreeNode>helper=new Stack<>();
        List<Integer>currans=new ArrayList<>();
        main.push(root);
        while(main.size()>0){
            TreeNode currnode=main.pop();
            currans.add(currnode.val);
            if(level==0){
                if(currnode.left !=null){
                    helper.push(currnode.left);
                }
                if(currnode.right!=null){
                    helper.push(currnode.right);
                }
            }else{
                 if(currnode.right!=null){
                    helper.push(currnode.right);
                }
                 if(currnode.left !=null){
                    helper.push(currnode.left);
                }

            }
            if(main.size()==0){
                ans.add(currans);
                currans=new ArrayList<>();
                level=1-level;
                main=helper;
                helper=new Stack<>();
            }
        }
        return ans;
    }
}