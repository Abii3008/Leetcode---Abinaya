// Last updated: 11/08/2026, 16:10:43
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)-> Integer.compare(a[1],b[1]));
        int c=1;
        int end = points[0][1];
        for(int[] p:points) {
            if(p[0] > end) {
                c++;
                end = p[1];
            }
        }
        return c;
    }
}