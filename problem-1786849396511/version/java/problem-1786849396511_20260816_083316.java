// Last updated: 16/08/2026, 08:33:16
1class Solution {
2    public int maximumGap(String skill, String station) {
3        int n = skill.length(),m=station.length();
4        int[] pre = new int[n],suf=new int[n];
5        int p=0;
6        for(int i=0;i<n;i++) {
7            while(station.charAt(p) != skill.charAt(i)) p++;
8            pre[i]=p++;
9        }
10        p=m-1;
11        for(int i=n-1;i>=0;i--) {
12            while(station.charAt(p)!=skill.charAt(i)) p--;
13            suf[i] =p--;
14        }
15        int ans =0;
16        for(int i=1;i<n;i++) 
17            ans=Math.max(ans,suf[i]-pre[i-1]);
18        return ans;
19    }
20}