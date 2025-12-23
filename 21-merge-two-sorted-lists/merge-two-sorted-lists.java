class Solution {  
    // Defines the Solution class as required by LeetCode

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {  
        // Function to merge two sorted linked lists and return the head of the merged list

        ListNode dummy = new ListNode(-1);  
        // Dummy node helps to simplify edge cases and acts as a temporary starting node

        ListNode curr = dummy;  
        // Pointer that will be used to build the merged linked list

        while (list1 != null && list2 != null) {  
        // Loop runs while both linked lists still have nodes

            if (list1.val <= list2.val) {  
            // If current node value of list1 is smaller or equal to list2

                curr.next = list1;  
                // Attach the current node of list1 to the merged list

                list1 = list1.next;  
                // Move list1 pointer to the next node
            } else {  
            // If current node value of list2 is smaller

                curr.next = list2;  
                // Attach the current node of list2 to the merged list

                list2 = list2.next;  
                // Move list2 pointer to the next node
            }

            curr = curr.next;  
            // Move the curr pointer forward to continue merging
        }

        if (list1 != null) {  
        // If list1 still has remaining nodes

            curr.next = list1;  
            // Attach remaining nodes of list1 to merged list
        } else {  
        // Otherwise, list2 has remaining nodes

            curr.next = list2;  
            // Attach remaining nodes of list2 to merged list
        }

        return dummy.next;  
        // Return the head of the merged linked list (skipping dummy node)
    }
}


//Time: O(n + m)

//Space: O(1)