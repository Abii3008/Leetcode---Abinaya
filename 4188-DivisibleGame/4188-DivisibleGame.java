// Last updated: 11/08/2026, 16:02:15
class Solution {
    public int divisibleGame(int[] nums) {
        long MOD =1_000_000_007L;
        Set<Integer> candidates = new HashSet<>();
        candidates.add(2);
        for(int x:nums) {
            for(int d=2;d*d<=x;d++) {
                if(x%d==0) {
                    candidates.add(d);
                    candidates.add(x/d);
                }
            }
            if(x>1) candidates.add(x);
        }
        long maxScore=Long.MIN_VALUE;
        int bestK =Integer.MAX_VALUE;
        for(int k:candidates) {
            long currentMax = (nums[0] %k==0) ? nums[0]: -nums[0];
            long totalMax = currentMax;
        for(int i=1;i<nums.length;i++) {
            long val=(nums[i]%k==0)? nums[i]:-nums[i];
            currentMax = Math.max(val,currentMax+val);
            totalMax = Math.max(totalMax,currentMax);
        }
        if(totalMax>maxScore){
            maxScore= totalMax;
            bestK =k;
        }else if (totalMax == maxScore){
            bestK = Math.min(bestK,k);
        }
    }
    long ans =(maxScore % MOD) * (bestK %MOD) % MOD;
    return (int) ((ans+MOD) %MOD);
}
}