/*
 * Problem: 20. Valid Parentheses
 * Link: https://leetcode.com/problems/valid-parentheses/
 * Difficulty: Easy
 * Topic: Stack, String
 * 
 * Approach:
 * - Use a stack to track opening brackets
 * - When we see an opening bracket, push its matching closing bracket
 * - When we see a closing bracket, it must match the top of the stack
 * - String is valid if the stack is empty at the end
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '[') stack.push(']');
            else if (c == '{') stack.push('}');
            else if (stack.isEmpty() || stack.pop() != c) return false;
        }
        
        return stack.isEmpty();
    }
}
