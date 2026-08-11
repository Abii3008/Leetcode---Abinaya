// Last updated: 11/08/2026, 16:06:46
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for(int s : stones) {
            q.offer(s);
        }
        while(q.size()>1) {
            int y=q.poll();
            int x=q.poll();
            if(y!=x) {
                q.offer(y-x);
            }
        }
        return q.size()==0?0:q.peek();
    }
}