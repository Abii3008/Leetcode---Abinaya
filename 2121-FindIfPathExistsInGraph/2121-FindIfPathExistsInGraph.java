// Last updated: 11/08/2026, 16:03:46
class Solution {
    public boolean validPath(int n, int[][] edges, int s, int d) {
        List<Integer>[] g = new ArrayList[n];
        for (int i = 0; i < n; i++) g[i] = new ArrayList<>();
        for (int[] e : edges) {
            g[e[0]].add(e[1]);
            g[e[1]].add(e[0]);
        }
        return dfs(g, new boolean[n], s, d);
    }
    boolean dfs(List<Integer>[] g, boolean[] v, int s, int d) {
        if (s == d) return true;
        v[s] = true;
        for (int i : g[s])
            if (!v[i] && dfs(g, v, i, d))
                return true;
        return false;
    }
}