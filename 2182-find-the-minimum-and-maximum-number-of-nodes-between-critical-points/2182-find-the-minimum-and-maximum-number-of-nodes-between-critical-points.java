/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
       
        List<Integer> ls = new ArrayList<>();
        int i = 1;
        ListNode prev = head;
        ListNode curr = head.next;
        while(curr.next!=null){
            ListNode next = curr.next;
            if(curr.val>prev.val && next.val<curr.val || curr.val<prev.val && curr.val<next.val){
                ls.add(i+1);
            }
            i++;
            prev = curr;
            curr = curr.next;
        }
        int[] ans = new int[2];
        int minD = Integer.MAX_VALUE;
        for(i = 1;i<ls.size();i++){
            minD = Math.min(ls.get(i)-ls.get(i-1),minD);
        }
        int maxD = -1;
       if(ls.size()>=2) maxD = ls.get(ls.size()-1)-ls.get(0);
       
        ans[0] = minD!=Integer.MAX_VALUE ? minD : -1;
        ans[1] = maxD;
        
        return ans;

        
    }
}