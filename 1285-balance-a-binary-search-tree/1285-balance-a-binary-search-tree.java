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
    List<TreeNode> ls = new ArrayList<>();
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        else{
            inorder(root.left);
            ls.add(root);
            inorder(root.right);
        }
    }
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
       return constructBST(0,ls.size()-1);
    }
    public TreeNode constructBST(int start,int end){
        if(start>end){
            return null;
        }
        int mid = start + (end-start)/2;
        TreeNode node = ls.get(mid);
        node.left = constructBST(start,mid-1);
        node.right = constructBST(mid+1,end);
        return node;

    }
}