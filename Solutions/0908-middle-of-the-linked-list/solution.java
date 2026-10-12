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
    public ListNode middleNode(ListNode head) {
        // ListNode temp=head;
        // int count=0;
        // while(temp!=null){
        //     count++;
        //     temp=temp.next;
        // }
        // temp=head;
        // for(int i=count/2;i>0;i--){
        //     temp=temp.next;
        // }
        // return temp;
        /*-------Approach-2------using slow,fast pointer-*/
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null)//fast!=null for the even no.nodes and fast.next!=null is for the odd no.of nodes
        {
            slow=slow.next;
            fast=fast.next.next;
            //fast=fast.next;
        }
        return slow;
    }
}
