// Last updated: 16/09/2026, 09:52:50
1class Solution {
2    public int maxTurbulenceSize(int[] arr) {
3        int n = arr.length;
4        if(n == 1) return 1;
5        int up = 1, down = 1, res = 1;
6        for(int i = 1; i < n; i++) {
7            if(arr[i] > arr[i-1]) {
8                up = down + 1;
9                down = 1;
10            } 
11            else if(arr[i] < arr[i-1]) {
12                down = up + 1;
13                up = 1;
14            } 
15            else {
16                up = down = 1;
17            }
18            res = Math.max(res, Math.max(up, down));
19        }
20        return res;
21    }
22}
23