package org.example.stack;

import java.util.Stack;

public class ValidParenthesis {
    private static boolean isValidParenthesis(String str){
        Stack<Character> stack= new Stack<>();
        for (char ch: str.toCharArray()) {
            if(isOpen(ch)){
                stack.push(ch);
            }else if(!stack.isEmpty() && isSameType(stack.peek(),ch)){
                stack.pop();
            }else {
                return false;
            }
        }
        return stack.size()==0;
    }

    private static boolean isSameType(char open,char close){
        return (open == '(' && close ==')') || (open == '{' && close == '}') || (open == '[' && close == ']');
    }
    private static boolean isOpen(char ch){
     return (ch == '(' || ch == '{' || ch=='[');
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isValidParenthesis("()"));          // true
        System.out.println(isValidParenthesis("()[]{}"));      // true
        System.out.println(isValidParenthesis("{[()]}"));      // true
        System.out.println(isValidParenthesis("([)]"));        // false
        System.out.println(isValidParenthesis("{[}"));         // false
        System.out.println(isValidParenthesis(""));            // true (empty string is valid)
        System.out.println(isValidParenthesis("((()))"));      // true
        System.out.println(isValidParenthesis("(()"));         // false
    }


}
