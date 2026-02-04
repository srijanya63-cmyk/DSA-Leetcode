import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    // Two queues
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // Push element onto stack
    public void push(int x) {

        // Put new element in empty queue q2
        q2.add(x);

        // Move all old elements behind it
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        // Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Remove and return top element
    public int pop() {
        return q1.remove();
    }

    // Return top element without removing
    public int top() {
        return q1.peek();
    }

    // Check if stack is empty
    public boolean empty() {
        return q1.isEmpty();
    }
}