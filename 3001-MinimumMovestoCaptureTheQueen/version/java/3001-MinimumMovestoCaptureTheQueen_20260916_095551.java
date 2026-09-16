// Last updated: 16/09/2026, 09:55:51
1class Solution {
2    public List<List<Integer>> findWinners(int[][] matches) {
3        Map<Integer, Integer> losses = new HashMap<>();
4        for (int[] match : matches) {
5            int winner = match[0];
6            int loser = match[1];
7            losses.putIfAbsent(winner, 0);
8            losses.put(loser, losses.getOrDefault(loser, 0) + 1);
9        }
10        List<Integer> zeroLoss = new ArrayList<>();
11        List<Integer> oneLoss = new ArrayList<>();
12        for (Map.Entry<Integer, Integer> entry : losses.entrySet()) {
13            if (entry.getValue() == 0) {
14                zeroLoss.add(entry.getKey());
15            } else if (entry.getValue() == 1) {
16                oneLoss.add(entry.getKey());
17            }
18        }
19        Collections.sort(zeroLoss);
20        Collections.sort(oneLoss);
21        List<List<Integer>> ans = new ArrayList<>();
22        ans.add(zeroLoss);
23        ans.add(oneLoss);
24        return ans;
25    }
26}
27