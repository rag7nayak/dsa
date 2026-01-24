package org.example.stack;

import java.util.Arrays;
import java.util.Stack;

public class ReversePolishNotation {
    public int evalRPN(String[] tokens){
        Stack<Integer> stack= new Stack<>();
        for (String token:tokens) {
            if(isOperator(token)){
                int operand2=stack.pop();
                int operand1=stack.pop();
                int result = evaluateResult(token,operand1,operand2);
                stack.push(result);
            }else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    private int evaluateResult(String token, int operand1, int operand2) {
        if(token.equals("+")){
            return operand1 + operand2;
        }else if (token.equals("-")){
            return operand1 - operand2;
        }else if (token.equals("*")){
            return operand1 * operand2;
        }else {
            return operand1 / operand2;
        }
    }

    private boolean isOperator(String token) {
        return token.equals("*") || token.equals("+") || token.equals("-") || token.equals("/");
    }

    public static void main(String[] args) {
        ReversePolishNotation rpn = new ReversePolishNotation();

        String[] expr1 = {"2", "1", "+", "3", "*"}; // (2 + 1) * 3 = 9
        System.out.println("Expression: " + Arrays.toString(expr1));
        System.out.println("Result: " + rpn.evalRPN(expr1)); // Expected: 9

        String[] expr2 = {"4", "13", "5", "/", "+"}; // 4 + (13 / 5) = 6
        System.out.println("Expression: " + Arrays.toString(expr2));
        System.out.println("Result: " + rpn.evalRPN(expr2)); // Expected: 6

        String[] expr3 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        // Complex LeetCode example → Expected: 22
        System.out.println("Expression: " + Arrays.toString(expr3));
        System.out.println("Result: " + rpn.evalRPN(expr3)); // Expected: 22
    }

}
