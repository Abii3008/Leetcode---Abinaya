// Last updated: 11/08/2026, 16:12:10
class Solution {
    public boolean isUgly(int n) {
 if (n <= 0) return false;
        int[] factors = {2, 3, 5};
        for (int factor : factors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        return n == 1;
    }
}
        