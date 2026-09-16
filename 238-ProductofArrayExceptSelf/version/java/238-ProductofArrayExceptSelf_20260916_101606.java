// Last updated: 16/09/2026, 10:16:06
1class Solution {
2    public int maxProduct(int[] nums) {
3        int max = nums[0], min = nums[0], ans = nums[0];
4        for (int i = 1; i < nums.length; i++) {
5            int temp = max; 
6            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
7            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);
8            if (max > ans) {
9                ans = max;
10            }
11        }
12        return ans;
13    }
14}