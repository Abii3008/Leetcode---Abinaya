// Last updated: 11/08/2026, 16:03:26
class Solution {
    public int smallestEvenMultiple(int n) {
        if(n % 2==0) {
            return n;   
        } else {
            return 2*n;
        }
        
    }
}