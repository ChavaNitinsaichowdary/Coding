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
    int ans = 0;
    public int countPairs(TreeNode root, int distance) {
         dfs(root,distance);
         return ans;
    }
    public int[] dfs(TreeNode root,int distance){
        if(root==null){
            return new int[11];
        }
        if(root.left==null && root.right==null){
            int[] res = new int[11];
            res[1]++;
            return res;
        }
        int[] left = dfs(root.left,distance);
        int[] right = dfs(root.right,distance);
        int pre = 0;
        for(int i = 1;i<=distance;i++){
            pre+=left[i];
            ans+=(pre*right[distance-i]);
        }
        int[] res = new int[11];
        for(int i = res.length-2;i>=1;i--){
            res[i+1] = left[i] + right[i];
        }
        return res;
    }
}