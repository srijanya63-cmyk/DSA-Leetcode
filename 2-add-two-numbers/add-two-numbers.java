class Solution {
    // Defines the Solution class

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Function to add two numbers represented as linked lists

        ListNode dummy = new ListNode(0);
        // Dummy node to simplify handling of the head of result list

        ListNode curr = dummy;
        // Pointer used to build the result linked list

        int carry = 0;
        // Variable to store carry during addition

        while (l1 != null || l2 != null || carry != 0) {
        // Continue loop while any list has nodes or carry exists

            int sum = carry;
            // Start sum with carry from previous addition

            if (l1 != null) { 
                sum += l1.val; 
                l1 = l1.next; 
            }
            // Add current digit of l1 to sum and move l1 forward

            if (l2 != null) { 
                sum += l2.val; 
                l2 = l2.next; 
            }
            // Add current digit of l2 to sum and move l2 forward

            curr.next = new ListNode(sum % 10);
            // Create a new node with the unit digit of sum

            carry = sum / 10;
            // Update carry (1 if sum >= 10, else 0)

            curr = curr.next;
            // Move pointer to the newly added node
        }

        return dummy.next;
        // Return the head of the result list (skipping dummy node)
    }
}
// Time Complexity: O(max(n, m))

//Space Complexity: O(max(n, m))