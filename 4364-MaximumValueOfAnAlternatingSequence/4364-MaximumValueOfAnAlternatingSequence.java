// Last updated: 11/08/2026, 16:01:32
class Solution {
    public long maximumValue(int n, int s, int m) {
        if(n==1) {
            return s;
        }
        long k = n/2;
        return (long)s+(k*m)-(k-1);
    }
}