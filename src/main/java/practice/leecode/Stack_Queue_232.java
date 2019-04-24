package practice.leecode;

import java.util.Stack;

public class Stack_Queue_232 {

    private Stack<Integer> stack;

    public Stack_Queue_232() {
        stack = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        Stack<Integer> tempStack = new Stack<>();
        while(!stack.empty()) {
            tempStack.push(stack.pop());
        }
        int value = tempStack.pop();
        while(!tempStack.empty()) {
            stack.push(tempStack.pop());
        }
        return value;
    }

    /** Get the front element. */
    public int peek() {
        return stack.get(0);
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.empty();
    }

}
