// Last updated: 16/09/2026, 10:21:51
1class Solution {
2    public String reverseWords(String s) {
3        String[] str = s.trim().split("\\s+");
4        String out = "";
5        for(int i=str.length-1;i>0;i--) {
6            out+=str[i]+ " ";
7        }
8        return out + str[0];
9    }
10}