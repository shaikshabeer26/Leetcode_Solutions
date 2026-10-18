// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//     //    ListNode temp1=l1,temp2=l2;
//     //    int n1=0,n2=0;
//     //     while(!is.empty(temp1.val)&&temp1.next!=null)
//     //     {
//     //      n1*=10+temp1.val;
//     //      temp1=temp1.next;
//     //     }
//     //      while((temp2.val!=null)&&temp2.next!=null)
//     //     {
//     //      n2*=10+temp2.val;
//     //      temp2=temp2.next;
//     //     }
//     //     int sum1=0,sum2=0;
//     //     while(n1>0){
//     //         int t=n1%10;
//     //         sum1*=10+t;
//     //         n1=n1/10;
//     //     }
//     //     while(n2>0){
//     //         int t=n2%10;
//     //         sum2*=10+t;
//     //         n2=n2/10;
//     //     }
//     //     return sum1+sum2;


//     ListNode temp1=l1;
//     ListNode temp2=l2;
//     sum=0;
//     while((temp1!=null)||(temp2!=null)){
//         if((temp1==null)||(temp2==null))
//         {

//         }
//         int t1=temp1.val,t2=temp2.val;
//         if((t1+t2)>10) 
//         {
//           carry=(t1+t2)/10;
//         }
//         sum*=10+(t1+t2)%10;

//     }
//     }
// }
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        ListNode result = dummyHead.next;
        dummyHead.next = null;
        return result;
    }
}
