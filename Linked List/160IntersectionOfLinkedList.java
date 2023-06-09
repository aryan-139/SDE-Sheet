/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

//Approach 1: Using 2 loops

public class Solution {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        while(head2 != null) {
        ListNode temp = head1;
        while(temp != null) {
            //if both nodes are same
            if(temp == head2) return head2;
            temp = temp.next;
        }
        head2 = head2.next;
    }
    //intersection is not present between the lists return null
    return null;
    }
}

//APPROACH 2: Using HashSet or Hashing in General 

public class Solution {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        HashSet<ListNode> st = new HashSet<>();
        while (head1 != null) {
            st.add(head1);
            head1 = head1.next;
        }
        while (head2 != null) {
            if (st.contains(head2))
                return head2;
            head2 = head2.next;
        }
        return null;
    }
}

//There are 2 more methods in difference of length and optimised, can go through and implement it completely in the next iteration 
//https://takeuforward.org/data-structure/find-intersection-of-two-linked-lists/
