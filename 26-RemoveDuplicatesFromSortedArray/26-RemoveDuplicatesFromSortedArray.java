// Last updated: 11/08/2026, 16:16:49
class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for(int i = 1;i< nums.length;i++) {
            if(nums[i] != nums[i-1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}