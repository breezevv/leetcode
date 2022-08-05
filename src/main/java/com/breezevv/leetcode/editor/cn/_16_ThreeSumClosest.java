package com.breezevv.leetcode.editor.cn;

import java.util.Arrays;

@SuppressWarnings("all")
public class _16_ThreeSumClosest {
    public static void main(String[] args) {
        Solution solution = new _16_ThreeSumClosest().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int ans = 3000;
            for (int i = 0; i < nums.length; i++) {
                if (i > 0 && nums[i] == nums[i + 1]) continue;
                int l = i + 1, r = nums.length - 1;
                while (l < r) {
                    if (Math.abs(nums[l] + nums[r] + nums[i] - target) < Math.abs(ans - target)) {
                        ans = nums[l] + nums[r] + nums[i];
                    } else if (nums[l] + nums[r] + nums[i] > target) {
                        r--;
                    } else {
                        l++;
                    }
                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}