package sampleproblemsofstackandqueue;

import java.util.Stack;

public class StockSpan {
    // Function to calculate span values
    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] spans = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Traverse the prices array
        for (int i = 0; i < n; i++) {
            // Pop elements from stack while stack is not empty and the top of the stack is less than or equal to the current price
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // If the stack becomes empty, the span is i + 1, otherwise it is the difference between current index and the top of the stack
            spans[i] = (stack.isEmpty()) ? (i + 1) : (i - stack.peek());

            // Push this element to stack
            stack.push(i);
        }

        return spans;
    }

    // Main function to test the calculateSpan method
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] spans = calculateSpan(prices);

        System.out.println("Prices: ");
        for (int price : prices) {
            System.out.print(price + " ");
        }

        System.out.println("\nSpans: ");
        for (int span : spans) {
            System.out.print(span + " ");
        }
    }
}
