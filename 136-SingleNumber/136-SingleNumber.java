// Last updated: 11/08/2026, 16:14:42
class Solution {
    public int singleNumber(int[] nums) {
        int x = 0;
        for (int num : nums) {
            x = x ^ num; 
        }
        return x;
    }
}