// Last updated: 11/08/2026, 16:17:08
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int original = x;
        long reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return original == reversed;
    }
}