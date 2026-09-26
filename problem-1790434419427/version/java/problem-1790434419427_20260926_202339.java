// Last updated: 26/09/2026, 20:23:39
1class Solution {
2    public int minQueenMoves(int[] source, int[] target) {
3        int r1 = source[0],c1=source[1];
4        int r2 = target[0],c2=target[1];
5        if(r1==r2 && c1==c2)
6        return 0;
7        if(r1==r2 || c1==c2)
8        return 1;
9        if(Math.abs(r1-r2)==Math.abs(c1-c2))
10        return 1;
11        return 2; 
12    }
13}