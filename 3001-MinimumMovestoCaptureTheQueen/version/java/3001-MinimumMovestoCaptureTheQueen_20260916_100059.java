// Last updated: 16/09/2026, 10:00:59
1class Solution {
2    public int maxSubarraySumCircular(int[] nums) {
3        int total = 0;
4        int currentMax = 0;
5        int maxSum = nums[0];
6        int currentMin = 0;
7        int minSum = nums[0];
8        for (int num : nums) {
9            currentMax = Math.max(num, currentMax + num);
10            maxSum = Math.max(maxSum, currentMax);
11            currentMin = Math.min(num, currentMin + num);
12            minSum = Math.min(minSum, currentMin);
13            total += num;
14        }
15        if (maxSum < 0) {
16            return maxSum;
17        }
18        return Math.max(maxSum, total - minSum);
19    }
20}