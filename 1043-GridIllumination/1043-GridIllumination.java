// Last updated: 11/08/2026, 16:06:50
import java.util.*;
class Solution {
    public int[] gridIllumination(int n, int[][] lamps, int[][] queries) {
        Map<Integer, Integer> rows = new HashMap<>();
        Map<Integer, Integer> cols = new HashMap<>();
        Map<Integer, Integer> diag = new HashMap<>();
        Map<Integer, Integer> antiDiag = new HashMap<>();
        Set<Long> active = new HashSet<>();
        for (int[] lamp : lamps) {
            int r = lamp[0];
            int c = lamp[1];
            long key = ((long) r << 32) | c;
            if (!active.add(key)) continue;
            rows.put(r, rows.getOrDefault(r, 0) + 1);
            cols.put(c, cols.getOrDefault(c, 0) + 1);
            diag.put(r - c, diag.getOrDefault(r - c, 0) + 1);
            antiDiag.put(r + c, antiDiag.getOrDefault(r + c, 0) + 1);
        }
        int[] ans = new int[queries.length];
        int[][] dirs = {
            {0,0},{0,1},{0,-1},{1,0},{-1,0},
            {1,1},{1,-1},{-1,1},{-1,-1}
        };
        for (int i = 0; i < queries.length; i++) {
            int r = queries[i][0];
            int c = queries[i][1];
            if (rows.getOrDefault(r, 0) > 0 ||
                cols.getOrDefault(c, 0) > 0 ||
                diag.getOrDefault(r - c, 0) > 0 ||
                antiDiag.getOrDefault(r + c, 0) > 0) {
                ans[i] = 1;
            }
            for (int[] d : dirs) {
                int nr = r + d[0];
                int nc = c + d[1];
                if (nr < 0 || nr >= n || nc < 0 || nc >= n)
                    continue;
                long key = ((long) nr << 32) | nc;
                if (active.remove(key)) {
                    rows.put(nr, rows.get(nr) - 1);
                    cols.put(nc, cols.get(nc) - 1);
                    diag.put(nr - nc, diag.get(nr - nc) - 1);
                    antiDiag.put(nr + nc, antiDiag.get(nr + nc) - 1);
                }
            }
        }
        return ans;
    }
}