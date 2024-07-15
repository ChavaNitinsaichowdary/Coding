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
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer,TreeNode> mp = new HashMap<>();
        HashSet<Integer> s = new HashSet<>();
        for(int[] desc : descriptions){
           int parv = desc[0];
           int childv = desc[1];
           int isleft = desc[2];
           TreeNode par = mp.getOrDefault(parv,new TreeNode(desc[0]));
           TreeNode child = mp.getOrDefault(childv,new TreeNode(desc[1]));
           if(isleft==1){
            par.left = child;
           }
           else{
            par.right = child;
           }
           mp.put(parv,par);
           mp.put(childv,child);
           s.add(childv);
        }
        for (Map.Entry<Integer,TreeNode> ele : mp.entrySet()) {
            if(s.contains(ele.getKey())){
                continue;
            }
            else{
                return mp.get(ele.getKey());
            }
        }
        return new TreeNode(-1);
    }
}