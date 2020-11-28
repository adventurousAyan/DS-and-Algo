//https://leetcode.com/explore/learn/card/linked-list/219/classic-problems/1205/
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
    public ListNode reverseList(ListNode head) {
        
        ListNode tmp = head;
         int i = 1;
        while(tmp != null && tmp.next != null) {
            ListNode tmp1 = tmp.next;
            if(tmp.next != null) {
                tmp.next = tmp.next.next;
            }
            else {tmp.next = null;}
            tmp1.next = head;
            head = tmp1;
           
            
            //To print the list in every iteration
            
//             ListNode tmp2 = head;           
//             System.out.println("Iteration - " + i);
//             while(tmp2 != null) {               
//                 System.out.println(tmp2.val);
//                 tmp2 = tmp2.next;
                
//             }
            i++;
        }
        return head;
        
    }
}
