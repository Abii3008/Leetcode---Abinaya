// Last updated: 11/08/2026, 16:01:49
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long totalSum = 0;
        int n = nums.length;
        for(int i=0;i<k;i++) {
            int currentNum = nums[n-1-i];
            long optionAdd = currentNum;
            long optionMul = (long) currentNum * mul;
            totalSum += Math.max(optionAdd,optionMul);
            mul--;
        }
        return totalSum;
    }          
}