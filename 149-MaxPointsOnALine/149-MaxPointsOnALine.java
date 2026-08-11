// Last updated: 11/08/2026, 16:14:28
class Solution {
    public int maxPoints(int[][] points) {
        int maxi=0;
        for(int [] x:points){
            Map<Double,Integer>slopes = new HashMap<>();
            for(int [] y: points){
                if(Arrays.equals(x,y)) continue;
                double slope = Double.POSITIVE_INFINITY;
                if(y[0] - x[0] != 0) {
                    slope=(double) (y[1] - x[1]) / (y[0]-x[0]);
                }
                if(slopes.containsKey(slope)){
                    slopes.put(slope,slopes.get(slope) +1);
                } else {
                    slopes.put(slope,1);
                }
                maxi=Math.max(maxi,slopes.get(slope));
            }
        }
        return maxi+1;
    }
}