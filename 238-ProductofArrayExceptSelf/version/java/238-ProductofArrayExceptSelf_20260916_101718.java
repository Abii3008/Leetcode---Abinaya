// Last updated: 16/09/2026, 10:17:18
1class Solution {
2    public int[][] merge(int[][] intervals) {
3        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
4        List<int[]> result = new ArrayList<>();
5        for (int[] interval : intervals) {
6            if (result.isEmpty() || result.get(result.size() - 1)[1] < interval[0]) {
7                result.add(interval);
8            } else {
9                result.get(result.size() - 1)[1] =
10                    Math.max(result.get(result.size() - 1)[1], interval[1]);
11            }
12        }
13        return result.toArray(new int[result.size()][]);
14    }
15}