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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode node  = head;
        int len = 0;
        while(node!=null){
            len++;
            node = node.next;
        }
        int cnt = len/k;
        System.out.println(cnt);
        if(cnt==0 || k==1)return head;
        node = head;
        ListNode prev = null;
        ListNode next = node.next;
        ListNode lastprev = node;
        ListNode currnode = node;
        while(cnt-->0){
            currnode = node;
            for(int i = 0;i<k;i++){
                node.next = prev;
                prev = node;
                node = next;
               if(next!=null) next = next.next;
            }
            if(cnt==(len/k)-1){
                head = prev;
            }
            
               lastprev.next = prev;
               currnode.next = node;
               lastprev = currnode;
               currnode = node;
            
        }

        return head;
    }
}