// Last updated: 11/08/2026, 16:06:55
class Solution {
    public int orangesRotting(int[][] g) {
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0, time = 0;
        for(int i=0;i<g.length;i++)
            for(int j=0;j<g[0].length;j++)
                if(g[i][j]==2) q.offer(new int[]{i,j});
                else if(g[i][j]==1) fresh++;
        int[][] d={{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty() && fresh>0){
            int size=q.size();
            while(size-->0){
                int[] cur=q.poll();
                for(int[] x:d){
                    int r=cur[0]+x[0], c=cur[1]+x[1];
                    if(r>=0&&c>=0&&r<g.length&&c<g[0].length&&g[r][c]==1){
                        g[r][c]=2;
                        fresh--;
                        q.offer(new int[]{r,c});
                    }
                }
            }
            time++;
        }
        return fresh==0 ? time : -1;
    }
}