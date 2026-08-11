// Last updated: 11/08/2026, 16:02:06
class Solution {
    public int minOperations(String s1, String s2) {
        int n = s1.length();
        long dp0 = 0, dp1 =Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            long n0 = Integer.MAX_VALUE,n1=Integer.MAX_VALUE;
            int v2=s2.charAt(i)-'0';
            if(dp0<Integer.MAX_VALUE){
                int v1=s1.charAt(i)-'0';
                if(v1==v2)n0=Math.min(n0,dp0);
                if(v1==0 && v2==1) n0=Math.min(n0,dp0+1);
                if(i<n-1){
                    long cost = dp0+(v1^1)+(s1.charAt(i+1) =='0' ? 1:0)+1+v2;
                    n1=Math.min(n1,cost);
                }
            }
            if(dp1<Integer.MAX_VALUE) {
                if(v2==0)n0=Math.min(n0,dp1);
                if(v2==1)n0=Math.min(n0,dp1+1);
                if(i<n-1) {
                    long cost =dp1+1+(s1.charAt(i+1)=='0' ? 1:0)+1+v2;
                    n1=Math.min(n1,cost);
                }
            }
            dp0=n0; dp1=n1;
        }
        return dp0>= Integer.MAX_VALUE ? -1 : (int)dp0;
    }
}