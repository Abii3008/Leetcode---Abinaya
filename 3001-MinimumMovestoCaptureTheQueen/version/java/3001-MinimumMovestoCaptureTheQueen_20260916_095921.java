// Last updated: 16/09/2026, 09:59:21
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        Set<Integer> numSet = new HashSet<>();
4        for (int num : nums) {
5            numSet.add(num);
6        }
7        int longest = 0;
8        for (int n : numSet) {
9            if (!numSet.contains(n - 1)) {
10                int length = 1;
11                while (numSet.contains(n + length)) {
12                    length++;
13                }
14                longest = Math.max(longest, length);
15            }
16        }
17        return longest;
18    }
19}