// Last updated: 16/09/2026, 10:13:44
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n = nums.length;
4        int[] answer = new int[n];
5        answer[0] = 1;
6        for (int i = 1; i < n; i++) {
7            answer[i] = answer[i - 1] * nums[i - 1];
8        }
9        int right = 1;
10        for (int i = n - 1; i >= 0; i--) {
11            answer[i] = answer[i] * right;
12            right = right * nums[i];
13        }
14        return answer;
15    }
16}