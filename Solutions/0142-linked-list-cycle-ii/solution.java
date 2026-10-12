/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
    Set<ListNode> h1=new HashSet<>();
    ListNode th=head;
    while(th!=null)
    {
        if(!h1.add(th)) return th;// bz,Hashset doesn't allow duplicate values;
        th=th.next;
    }
    return null;
     /*ListNode slow=head;
     ListNode fast=head;
     while(fast!=null&&fast.next!=null){
       slow=slow.next;
       fast=fast.next.next;
       if(slow==fast) return fast.next.next;
     }
     return null;*/
    }
}
