// Last updated: 11/08/2026, 16:10:31
class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
    }
}