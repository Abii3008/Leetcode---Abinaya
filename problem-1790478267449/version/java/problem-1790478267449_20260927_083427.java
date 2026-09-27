// Last updated: 27/09/2026, 08:34:27
1class Solution {
2    public int maxEqualAdjacentPairs(int[] nums) {
3        int basePairs=0;
4        Map<Long,Integer> pairCounts=new HashMap<>();
5        for(int i=0;i<nums.length-1;i++) {
6            if(nums[i]==nums[i+1]) {
7                basePairs++;
8            } else {
9                long u=Math.min(nums[i],nums[i+1]);
10                long v=Math.max(nums[i],nums[i+1]);
11                long key = (u<<32) |  v;
12                pairCounts.put(key,pairCounts.getOrDefault(key,0)+1);
13            }
14        }
15        int maxGain =0;
16        for(int count: pairCounts.values()) {
17            maxGain = Math.max(maxGain,count);
18        }
19        return basePairs+maxGain;
20    }
21}