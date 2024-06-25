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
    public TreeNode bstToGst(TreeNode root) {
        int[] sum = new int[1];
         return help(root,sum);
    }
    public TreeNode help(TreeNode root,int[] sum){
        if(root==null)return null;
        if(root.left==null && root.right==null){
            sum[0]+=root.val;
            root.val = sum[0];
            return root;
        }
        root.right = help(root.right,sum);
        sum[0]+=root.val;
        root.val = sum[0];
        root.left = help(root.left,sum);
        return root;

        
    }
}