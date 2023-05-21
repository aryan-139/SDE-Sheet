class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;

        ListNode slow = head;
        ListNode fast = head;

        // Find the middle of the list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the list
        ListNode reversedSecondHalf = reverseList(slow);

        // Compare the first half with the reversed second half
        ListNode p1 = head;
        ListNode p2 = reversedSecondHalf;
        while (p2 != null) {
            if (p1.val != p2.val)
                return false;
            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

//Approach is basically that I am trying to find the middle of the array using the slow and the fast pointers; reversing the Linked List from the middle onwards and comparing for similiarity or lets say for dissimilarity; if dissimilar then not a palindrome else a palindrome
