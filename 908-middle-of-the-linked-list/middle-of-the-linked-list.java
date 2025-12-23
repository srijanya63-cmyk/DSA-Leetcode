class Solution {
    // srijanya
    
    public ListNode middleNode(ListNode head) {
        
        // Create a slow pointer starting at the head of the linked list
        ListNode slow = head;
        
        // Create a fast pointer starting at the head of the linked list
        ListNode fast = head;
        
        // Loop will continue until fast reaches the end of the list
        // fast != null ensures fast has not reached the end
        // fast.next != null ensures fast can move two steps safely
        while (fast != null && fast.next != null) {
            
            // Move slow pointer one step forward
            slow = slow.next;
            
            // Move fast pointer two steps forward
            fast = fast.next.next;
        }
        
        // When fast reaches the end, slow will be at the middle node
        // In case of even number of nodes, slow points to the second middle
        return slow;
    }
}
