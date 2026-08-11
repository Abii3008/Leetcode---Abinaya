// Last updated: 11/08/2026, 16:13:25
public class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1); 
            count++;
        }
        return count;
    }
}
