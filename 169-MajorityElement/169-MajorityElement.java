// Last updated: 11/08/2026, 16:14:12
class Solution {
    public int majorityElement(int[] nums) {
        int t = 0;
        int c = 0;
        for (int num : nums) {
            if (t == 0) {
                c = num;
            }
            if (num == c) {
                t++;
            } else {
                t--;
            }
        }
        return c;
    }
}
