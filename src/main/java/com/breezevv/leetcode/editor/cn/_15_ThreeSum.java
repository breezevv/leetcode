package com.breezevv.leetcode.editor.cn;

import com.breezevv.leetcode.utils.LeetCodeUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("all")
public class _15_ThreeSum {
    public static void main(String[] args) {
        Solution solution = new _15_ThreeSum().new Solution();
        System.out.println(solution.threeSum(LeetCodeUtils.create1dIntArray("[-2,0,0,2,2]")));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> res = new LinkedList<>();
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                if (i > 0 && nums[i - 1] == nums[i]) continue;
                int target = -nums[i];
                int l = i + 1, r = nums.length - 1;
                while (l < r) {
                    if (nums[l] + nums[r] < target) l++;
                    else if (nums[l] + nums[r] > target) r--;
                    else {
                        List<Integer> integers = new ArrayList<>();
                        integers.add(nums[i]);
                        integers.add(nums[l]);
                        integers.add(nums[r]);
                        res.add(integers);
                        while (l < r && nums[l + 1] == nums[l]) l++;
                        while (l < r && nums[r - 1] == nums[r]) r--;
                        l++;
                        r--;
                    }

                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}