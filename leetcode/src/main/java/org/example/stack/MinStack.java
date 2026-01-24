package org.example.stack;

import java.util.Stack;

public class MinStack {

    Stack<Integer> mainStack,auxilaryStack;

    public MinStack(){
       this.mainStack= new Stack<>();
       this.auxilaryStack= new Stack<>();

    }
    public void push(int val){
       this.mainStack.push(val);
       if (auxilaryStack.isEmpty() || auxilaryStack.peek()> val){
           this.auxilaryStack.push(val);
       }
    }
    public void pop(){
       if(mainStack.peek() == auxilaryStack.peek()){
           this.auxilaryStack.pop();
       }
        this.mainStack.pop();
    }
    public int top(){
       return this.mainStack.peek();
    }
    public int getMin(){
       return this.auxilaryStack.peek();
    }
    public static void main(String[] args) {
        MinStack stack = new MinStack();

        stack.push(5);
        stack.push(3);
        stack.push(7);
        stack.push(2);

        System.out.println("Top element: " + stack.top());       // Expected: 2
        System.out.println("Min element: " + stack.getMin());    // Expected: 2

        stack.pop(); // removes 2
        System.out.println("Top element after pop: " + stack.top());    // Expected: 7
        System.out.println("Min element after pop: " + stack.getMin()); // Expected: 3

        stack.pop(); // removes 7
        System.out.println("Top element after pop: " + stack.top());    // Expected: 3
        System.out.println("Min element after pop: " + stack.getMin()); // Expected: 3

        stack.pop(); // removes 3
        System.out.println("Top element after pop: " + stack.top());    // Expected: 5
        System.out.println("Min element after pop: " + stack.getMin()); // Expected: 5
    }

}
