package com.breezevv.leetcode.editor.cn;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@SuppressWarnings("all")
public class _17_LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        Solution solution = new _17_LetterCombinationsOfAPhoneNumber().new Solution();
        System.out.println(solution.letterCombinations("23"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        private Map<Character, String> map = new HashMap<Character, String>(){
            {
                put('2', "abc");
                put('3', "def");
                put('4', "ghi");
                put('5', "jkl");
                put('6', "mno");
                put('7', "pqrs");
                put('8', "tuv");
                put('9', "wxyz");
            }
        };

        List<String> res = new LinkedList<>();

        public List<String> letterCombinations(String digits) {
            if (digits.length() == 0) return res;
            dfs(0, digits, new StringBuilder());
            return res;
        }

        private void dfs(int index, String digits, StringBuilder tmp) {
            if (index == digits.length()) {
                res.add(tmp.toString());
                return;
            }
            char[] cs = map.get(digits.charAt(index)).toCharArray();
            for (int i = index; i < cs.length; i++) {
                tmp.append(cs[i]);
                dfs(index + 1, digits, tmp);
                tmp.deleteCharAt(tmp.length() - 1);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}