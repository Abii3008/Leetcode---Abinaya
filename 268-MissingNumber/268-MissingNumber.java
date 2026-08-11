// Last updated: 11/08/2026, 16:12:07
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int a = 0;
        for(int i = 0; i < n; i++) {
            sum += nums[i];       
        } 
        for(int i = 0; i < n; i++) {
            a = n * (n+1)/2;
        }
        return (a-sum);
    }
}