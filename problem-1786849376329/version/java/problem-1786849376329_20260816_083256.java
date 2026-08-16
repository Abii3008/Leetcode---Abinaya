// Last updated: 16/08/2026, 08:32:56
1class Solution {
2    public int nearestDrone(int[][] drones, int[] target) {
3        int ans =-1, min = Integer.MAX_VALUE;
4        for(int i=0;i<drones.length;i++) {
5            int d=Math.abs(drones[i][0] - target[0]) +  Math.abs(drones[i][1] - target[1]);
6            if(d<= drones[i][2] && d<min ) {
7                min=d;
8                ans=i;
9            }
10        }
11        return ans;
12    }
13}