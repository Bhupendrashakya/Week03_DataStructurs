package sampleproblemsofstackandqueue;

import java.util.Stack;

public class QueueUsingStack {
    // Two stacks to handle the queue operations
    Stack<Integer> enqueStack;
    Stack<Integer> dequeueStack;

    // Constructor to initialize the stacks
    public QueueUsingStack() {
        this.enqueStack = new Stack<>();
        this.dequeueStack = new Stack<>();
    }

    // Method to add elements to the queue
    public void enqueue(int element) {
        enqueStack.push(element);
        System.out.println(element + " has been pushed.");
    }

    // Method to remove elements from the queue
    public void dequeue() {
        // Move elements from enqueStack to dequeueStack if dequeueStack is empty
        if (dequeueStack.isEmpty()) {
            while (!enqueStack.isEmpty()) {
                dequeueStack.push(enqueStack.pop());
            }
        }
        // Check if dequeueStack is still empty after moving elements
        if (dequeueStack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(dequeueStack.pop() + " has been deleted.");
        }
    }

    // Method to get the front element of the queue without removing it
    public void peek() {
        // Move elements from enqueStack to dequeueStack if dequeueStack is empty
        if (dequeueStack.isEmpty()) {
            while (!enqueStack.isEmpty()) {
                dequeueStack.push(enqueStack.pop());
            }
        }
        // Check if dequeueStack is still empty after moving elements
        if (dequeueStack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(dequeueStack.peek());
        }
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return enqueStack.isEmpty() && dequeueStack.isEmpty();
    }

    // Main method to test the QueueUsingStack class
    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        queue.peek();  // Should print "Stack is empty"
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.peek();  // Should print the first element added, which is 1
        queue.dequeue();  // Should remove the first element added, which is 1
        queue.peek();  // Should print the new first element, which is 2
        System.out.println(queue.isEmpty());  // Should print false
    }
}
