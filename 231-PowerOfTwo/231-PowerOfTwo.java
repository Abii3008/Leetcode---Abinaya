// Last updated: 11/08/2026, 16:12:27
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0){
            return false;
        } else {
            return (n&(n-1))==0;
        }
    }
}
