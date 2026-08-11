// Last updated: 11/08/2026, 16:02:37
class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] +1 == nums[i+1]) {
                sum+=nums[i+1];
            }
            else {
                break;
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        while(set.contains(sum)){
            sum++;
        }
        return sum;
    }
}