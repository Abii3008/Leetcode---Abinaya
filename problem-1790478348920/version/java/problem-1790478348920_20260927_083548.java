// Last updated: 27/09/2026, 08:35:48
1class Solution {
2    public int[] rearrangeArray(int[] nums) {
3        int[] freq = new int[101];
4        for(int x: nums) {
5            freq[x]++;
6        }
7        int[] ans = new int [nums.length];
8        int idx=0;
9        while(idx<nums.length) {
10            for(int v=1;v<=100;v++) {
11                if(freq[v] > 0) {
12                    ans[idx++]=v;
13                    freq[v]--;
14                }
15            }
16        }
17        return ans;
18    }
19}