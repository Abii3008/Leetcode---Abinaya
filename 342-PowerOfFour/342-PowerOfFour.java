// Last updated: 11/08/2026, 16:11:37
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n < 1) return false;
        if(n==1)return true;
        while(n%4==0) {
            n/=4;
        }    
    
        if(n==1) return true;
        else return false;
    }
}




