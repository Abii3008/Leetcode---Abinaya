// Last updated: 11/08/2026, 16:02:13
class Solution {
    public boolean checkGoodInteger(int n) {
        int dS = 0;
        int sS = 0;
        int temp = n;
        while(temp>0) {
            int digit = temp%10;
            dS += digit;
            sS += digit * digit;
            temp/= 10;
        }
        return (sS - dS) >= 50;
    }
}