class Solution {
    // Defines the Solution class

    public ListNode rotateRight(ListNode head, int k) {
        // Function to rotate the linked list to the right by k places

        if (head == null || head.next == null || k == 0)
            return head;
        // If list is empty, has one node, or k is 0 → no rotation needed

        ListNode curr = head;
        // Pointer to traverse the list

        int length = 1;
        // Variable to store the length of the linked list

        while (curr.next != null) {
            curr = curr.next;
            length++;
        }
        // Traverse list to find its length and last node

        curr.next = head;
        // Connect last node to head → make the list circular

        k = k % length;
        // Reduce k because rotating length times gives same list

        int stepsToNewHead = length - k;
        // Number of steps to reach the new head

        ListNode newTail = curr;
        // newTail starts from the last node

        while (stepsToNewHead-- > 0) {
            newTail = newTail.next;
        }
        // Move newTail to the correct position

        ListNode newHead = newTail.next;
        // newHead is the node after newTail

        newTail.next = null;
        // Break the circular link to form the final list

        return newHead;
        // Return the rotated list head
    }
}
// Time Complexity: O(n)

//Space Complexity: O(1)