package com.breezevv.leetcode.editor.cn;

import com.breezevv.leetcode.utils.LeetCodeUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("all")
public class _18_FourSum {
    public static void main(String[] args) {
        Solution solution = new _18_FourSum().new Solution();
        int[] nums = LeetCodeUtils.create1dIntArray("[1,0,-1,0,-2,2]");
        System.out.println(solution.fourSum(nums, 0));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>> res = new ArrayList<>();
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                if (i > 0 && nums[i - 1] == nums[i]) continue;
                for (int j = i + 1; j < nums.length; j++) {
                    if (j > i + 1 && nums[j - 1] == nums[j]) continue;
                    int l = j + 1, r = nums.length - 1;
                    while (l < r) {
                        if (nums[i] + nums[j] + nums[l] + nums[r] > target) {
                            r--;
                        } else if (nums[i] + nums[j] + nums[l] + nums[r] < target) {
                            l++;
                        } else {
                            List<Integer> list = new ArrayList<>(4);
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[l]);
                            list.add(nums[r]);
                            res.add(list);
                            while (l < r && nums[l] == nums[l + 1]) l++;
                            while (l < r && nums[r - 1] == nums[r]) r--;
                            l++;
                            r--;
                        }
                    }
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}