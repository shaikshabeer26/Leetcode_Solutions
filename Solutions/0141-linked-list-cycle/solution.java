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
    public boolean hasCycle(ListNode head) {
        /*----using hashset---Approach-2----*/
        // ListNode th=head;
        // Set<ListNode> h1=new HashSet<>();
        // while(th!=null){
        //  if(h1.contains(th)) return true;
        //  h1.add(th);
        //  th=th.next;
        // }
        // return false;

    /*-----floyd's cycle dection algorithm---(Approach-2)----*/
    /*when ever fast and slower pointer meet at some node then we can say that loop exist in the Linked list. if they doesn't meet any where then we cans say that loop doesn't exist--*/
    ListNode slow=head;
    ListNode fast=head;
    while(fast!=null&& fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast) return true;
    }
    return false;

    }
}
