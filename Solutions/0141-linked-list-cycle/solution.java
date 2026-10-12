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
        ListNode th=head;
        Set<ListNode> h1=new HashSet<>();
        while(th!=null){
         if(h1.contains(th)) return true;
         h1.add(th);
         th=th.next;
        }
        return false;
    }
}
