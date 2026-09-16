// Last updated: 16/09/2026, 10:18:45
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        Set<Character> set = new HashSet<>();
4        int l = 0, ans = 0;
5        for (int r = 0; r < s.length(); r++) {
6            while (set.contains(s.charAt(r)))
7                set.remove(s.charAt(l++));
8            set.add(s.charAt(r));
9            ans = Math.max(ans, r - l + 1);
10        }
11        return ans;
12    }
13}