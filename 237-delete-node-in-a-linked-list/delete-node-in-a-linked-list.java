class Solution {
    
    // This method deletes the given node from the linked list
    public void deleteNode(ListNode node) {
        
        // Store the next node of the given node
        ListNode nextNode = node.next;
        
        // Copy the value of the next node into the current node
        node.val = nextNode.val;
        
        // Update the next pointer of the current node
        // This skips the next node in the linked list
        node.next = nextNode.next;
        
        // Disconnect the next node completely (helps in garbage collection)
        nextNode.next = null;
    }
}
