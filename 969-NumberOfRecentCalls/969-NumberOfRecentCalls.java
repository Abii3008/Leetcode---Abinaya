// Last updated: 11/08/2026, 16:07:06
class RecentCounter {
    Queue<Integer> q = new LinkedList<>();
    public RecentCounter() {}
    public int ping(int t) {
        q.offer(t);
        while (q.peek() < t - 3000)
            q.poll();
        return q.size();
    }
}