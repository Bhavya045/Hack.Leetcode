/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null){
            return "";
        }
        Queue <TreeNode>q=new LinkedList<>();
        StringBuilder res=new StringBuilder();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            if(node==null){
            res.append("n ");
            continue;
            }else{
            res.append(node.val).append(" ");
            q.add(node.left);
            q.add(node.right);
            }
        }
        return res.toString().trim();
    }

    // Decodes your encoded data to tree.
     public TreeNode deserialize(String data) {
        if (data.equals("")) { // Fix string comparison
            return null;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        String[] values = data.split(" "); // Split values based on spaces
        
        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        q.add(root);
        
        for (int i = 1; i < values.length; i++) {
            TreeNode parent = q.poll();
            
            // Process the left child
            if (!values[i].equals("n")) {
                TreeNode left = new TreeNode(Integer.parseInt(values[i]));
                parent.left = left;
                q.add(left);
            }
            
            // Process the right child if `i + 1` is within bounds
            if (++i < values.length && !values[i].equals("n")) {
                TreeNode right = new TreeNode(Integer.parseInt(values[i]));
                parent.right = right;
                q.add(right);
            }
        }
        
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));