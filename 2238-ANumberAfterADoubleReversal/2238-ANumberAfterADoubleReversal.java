// Last updated: 11/08/2026, 16:03:33
class Solution {
    public boolean isSameAfterReversals(int num) {
        return num == reverse(reverse(num));
    }

    private int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }
}
 
    