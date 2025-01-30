package sampleproblemsofstackandqueue;

import java.util.Stack;

public class SortStackUsingRecursion {

    // Function to sort the stack
    public static void sortStack(Stack<Integer> stack){
        // Base case: if stack is empty, return
        if(!stack.isEmpty()){
            // Pop the top element
            int temp = stack.pop();
            // Recursively sort the remaining stack
            sortStack(stack);
            // Insert the popped element back in sorted order
            insertSort(stack, temp);
        }
    }

    // Helper function to insert an element in sorted order
    public static void insertSort(Stack<Integer> stack, int element){
        // Base case: if stack is empty or the element is greater than the top element
        if (stack.isEmpty() || element > stack.peek()){
            // Push the element
            stack.push(element);
            return;
        }
        // Pop the top element
        int temp = stack.pop();
        // Recursively call insertSort to place the element
        insertSort(stack, element);
        // Push the popped element back to the stack
        stack.push(temp);
    }

    // Main function to test the sorting
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // Push elements to the stack
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);

        // Print original stack
        System.out.println("Original Stack: " + stack);
        // Sort the stack
        sortStack(stack);
        // Print sorted stack
        System.out.println("Sorted Stack: " + stack);
    }
}
