// Last updated: 11/08/2026, 16:01:30
class Solution {
    public int maxDigitRange(int[] nums) {
        int maxRange=0,sum=0;
        for(int n:nums) {
            int t=n,max=0,min=9;
            while(t>0){
                int d=t%10;
                max=Math.max(max,d);
                min=Math.min(min,d);
                t/=10;
            }
            maxRange=Math.max(maxRange,max-min);
        }
        for(int n:nums) {
            int t=n,max=0,min=9;
            while(t>0) {
                int d=t%10;
                max=Math.max(max,d);
                min=Math.min(min,d);
                t/=10;
            }
            if(max-min==maxRange) sum+=n;
        }
        return sum;
    }
}