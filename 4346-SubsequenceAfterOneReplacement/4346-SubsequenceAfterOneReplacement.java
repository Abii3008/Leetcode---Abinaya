// Last updated: 11/08/2026, 16:01:57
class Solution {
    public boolean canMakeSubsequence(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n>m) return false;
        int[] left = new int[n];
        int j=0;
        for(int i=0;i<n;i++) {
            while(j<m && t.charAt(j) != s.charAt(i)) {
                j++;
            }
            left[i] =j;
            if(j<m) j++;
        }
        if(left[n-1] <m)return true;
        int[] right = new int[n];
        j=m-1;
        for(int i=n-1;i>=0;i--) {
            while(j>=0 && t.charAt(j) != s.charAt(i)) {
                j--;
            }
            right[i] =j;
            if(j>=0) j--;
        }
        for(int i=0;i<n;i++) {
            int lBound = (i==0) ?-1:left[i-1];
            int rBound = (i==n-1) ? m:right[i+1];
            if(rBound - lBound>1) {
                return true;
            }
        }
        return false;
    }
}
      