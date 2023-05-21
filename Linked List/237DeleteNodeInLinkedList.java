/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
       if(node==null)
       return;
       node.val=node.next.val;
       node.next=node.next.next;
       return;
    }
}

//Approach is simple that is to simply operare on the right side of the linked list and copy the value of the next node in the deleted node and establish a new connection that is from the deleted node to the next to next element; easy
