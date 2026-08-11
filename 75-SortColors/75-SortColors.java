// Last updated: 11/08/2026, 16:15:35
class Solution {
    public void sortColors(int[] nums) {
        int count0 = 0,count1 = 0;
        for(int x : nums) {
            if(x==0) count0++;
            else if(x==1) count1++;
        }
        int i = 0;
        for(;i<count0;i++)
        nums[i] = 0;
        for(;i < count0 + count1; i++)
        nums[i] = 1;
        for(;i<nums.length;i++)
        nums[i] =2;
    }
}