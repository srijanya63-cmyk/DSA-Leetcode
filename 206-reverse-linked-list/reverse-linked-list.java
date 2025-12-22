class Solution {
    public ListNode reverseList(ListNode head) {

        // prev will store the previous node (initially null)
        ListNode prev = null;

        // curr will traverse the linked list starting from head
        ListNode curr = head;

        // Loop until we reach the end of the list
        while (curr != null) {

            // Store the next node before breaking the link
            ListNode nextNode = curr.next;

            // Reverse the current node's pointer
            curr.next = prev;

            // Move prev one step forward
            prev = curr;

            // Move curr one step forward
            curr = nextNode;
        }

        // prev will be the new head of the reversed list
        return prev;
    }
}
// Time Complexity: O(n) (each node visited once)
// Space complexity O(1) (no extra memory used)

