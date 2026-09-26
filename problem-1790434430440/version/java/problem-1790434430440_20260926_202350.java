// Last updated: 26/09/2026, 20:23:50
1class Solution {
2    public boolean canTransform(int[] source, int[] target) {
3        long s=0,t=0;
4        for(int x:source) s+=x;
5        for(int x:target) t+=x;
6        return s==t;
7    }
8}