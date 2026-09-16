// Last updated: 16/09/2026, 09:58:19
1class Solution {
2    public int findDuplicate(int[] nums) {
3        int n = nums.length;
4        int[] arr=new int[n+1];
5        for(int i=0;i<n;i++) {
6            arr[nums[i]]++;
7            if(arr[nums[i]]>1) {
8                return nums[i];
9            }
10        }
11        return n;
12    }
13}