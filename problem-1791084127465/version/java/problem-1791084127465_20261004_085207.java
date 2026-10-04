// Last updated: 04/10/2026, 08:52:07
1class Solution {
2    public long maxAlternatingSum(int[] nums) {
3        long p0=nums[0];
4        long n0=Long.MIN_VALUE/4;
5        long p1=Long.MIN_VALUE/4;
6        long n1=Long.MIN_VALUE/4;
7        long pp=p0;
8        long pn=n0;
9        long ans=p0;
10        for(int i=1;i<nums.length;i++) {
11            long x=nums[i];
12            long np0=Math.max(x,n0+x);
13            long nn0 = p0-x;
14            long np1=Math.max(x,Math.max(n1+x,pn+x));
15            long nn1=Math.max(p1-x,pp-x);
16            pp=p0;
17            pn=n0;
18            p0=np0;
19            n0=nn0;
20            p1=np1;
21            n1=nn1;
22            ans=Math.max(ans,Math.max(p0,Math.max(n0,Math.max(p1,n1))));  
23        }
24        return ans;
25    }
26}