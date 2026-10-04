// Last updated: 04/10/2026, 08:11:40
1class Solution {
2    public int minRotations(String s) {
3      int current =0;
4      int total =0;
5        for(int i=0;i<s.length();i++){
6            int next=s.charAt(i)-'0';
7            int diff=Math.abs(current-next);
8            total+=Math.min(diff,10-diff);
9            current=next;
10        }
11        return total;
12    }
13}