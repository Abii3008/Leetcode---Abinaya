// Last updated: 11/08/2026, 16:02:16
class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;
        if(n==0) return 0;
        long dp0 = nums[0];
        long dp1 = (long) nums[0] * k;
        long dp2 = nums[0]/k;
        long dp3 = Long.MIN_VALUE/2;
        long maxSum = Math.max(dp0, Math.max(dp1,dp2));
        for(int i=1;i<n;i++) {
            long val = nums[i];
            long mul = val*k;
            long div = val/k;
            long next_dp0 = Math.max(val,dp0+val);
            long next_dp1 = Math.max(mul,Math.max(dp0+mul,dp1+mul));
            long next_dp2 = Math.max(div,Math.max(dp0+div,dp2+div));
            long next_dp3 = Math.max(val,Math.max(dp3+val,Math.max(dp1+val,dp2+val)));
            dp0 = next_dp0;
            dp1 = next_dp1;
            dp2 = next_dp2;
            dp3 = next_dp3;   
            maxSum = Math.max(maxSum,Math.max (dp0,Math.max(dp1,Math.max(dp2,dp3))));
        }
        return maxSum;
    }
}