class MyLinkedList {

    // ================= NODE CLASS =================
    // This class represents a single node of the linked list
    private class Node {
        int val;        // stores value of the node
        Node next;      // reference to the next node

        // Constructor to create a new node
        Node(int val) {
            this.val = val;     // assign value to node
            this.next = null;   // initially next is null
        }
    }

    // ================= LINKED LIST VARIABLES =================
    private Node head;   // points to first node of list
    private Node tail;   // points to last node of list
    private int size;    // stores number of nodes

    // ================= CONSTRUCTOR =================
    public MyLinkedList() {
        head = null;     // list is empty initially
        tail = null;     // no last node yet
        size = 0;        // size is zero
    }

    // ================= GET VALUE AT INDEX =================
    public int get(int index) {

        // if index is invalid, return -1
        if (index < 0 || index >= size) {
            return -1;
        }

        // start from head node
        Node temp = head;

        // move temp to the required index
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        // return value at index
        return temp.val;
    }

    // ================= ADD NODE AT HEAD =================
    public void addAtHead(int val) {

        // create a new node
        Node newNode = new Node(val);

        // if list is empty
        if (size == 0) {
            head = newNode;  // head points to new node
            tail = newNode;  // tail also points to new node
        } 
        // if list already has elements
        else {
            newNode.next = head; // new node points to old head
            head = newNode;      // head becomes new node
        }

        size++; // increase size
    }

    // ================= ADD NODE AT TAIL =================
    public void addAtTail(int val) {

        // create a new node
        Node newNode = new Node(val);

        // if list is empty
        if (size == 0) {
            head = newNode;  // head points to new node
            tail = newNode;  // tail points to new node
        } 
        // if list is not empty
        else {
            tail.next = newNode; // old tail points to new node
            tail = newNode;      // update tail
        }

        size++; // increase size
    }

    // ================= ADD NODE AT INDEX =================
    public void addAtIndex(int index, int val) {

        // if index is invalid, do nothing
        if (index < 0 || index > size) {
            return;
        }

        // if index is 0, add at head
        if (index == 0) {
            addAtHead(val);
            return;
        }

        // if index is equal to size, add at tail
        if (index == size) {
            addAtTail(val);
            return;
        }

        // reach the node just before the index
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        // create new node
        Node newNode = new Node(val);

        // adjust links
        newNode.next = temp.next; // new node points to next node
        temp.next = newNode;      // previous node points to new node

        size++; // increase size
    }

    // ================= DELETE NODE AT INDEX =================
    public void deleteAtIndex(int index) {

        // if index is invalid, do nothing
        if (index < 0 || index >= size) {
            return;
        }

        // if deleting the first node
        if (index == 0) {
            head = head.next; // move head to next node

            // if only one node existed
            if (size == 1) {
                tail = null; // tail should also be null
            }

            size--; // decrease size
            return;
        }

        // reach the node just before the one to delete
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        // delete node by skipping it
        temp.next = temp.next.next;

        // if last node was deleted, update tail
        if (index == size - 1) {
            tail = temp;
        }

        size--; // decrease size
    }
}
