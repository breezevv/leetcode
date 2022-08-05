package com.breezevv.leetcode.editor.cn;

@SuppressWarnings("all")
public class _3_LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Solution solution = new _3_LongestSubstringWithoutRepeatingCharacters().new Solution();
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int[] cnt = new int[128];
            char[] cs = s.toCharArray();
            int left = 0, right = 0, res = 0;
            while (right < cs.length) {
                char ch = cs[right];
                cnt[ch]++;
                while (cnt[ch] > 1) {
                    cnt[cs[left]]--;
                    left++;
                }
                res = Math.max(res, right - left + 1);
                right++;
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}