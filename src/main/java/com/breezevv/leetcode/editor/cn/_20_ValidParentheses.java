package com.breezevv.leetcode.editor.cn;

import java.util.Stack;

@SuppressWarnings("all")
public class _20_ValidParentheses {
    public static void main(String[] args) {
        Solution solution = new _20_ValidParentheses().new Solution();
        System.out.println(solution.isValid("(([]())"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for (char c : s.toCharArray()) {
                if (c == '[' || c == '(' || c == '{') {
                    stack.push(c);
                    continue;
                }
                if (stack.isEmpty()) return false;
                if (c == ']' && stack.peek() == '[') {
                    stack.pop();
                }
                if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                }
                if (c == '}' && stack.peek() == '{') {
                    stack.pop();
                }
            }
            return stack.isEmpty();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}