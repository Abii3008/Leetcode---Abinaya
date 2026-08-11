// Last updated: 11/08/2026, 16:02:01
class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
        int i=series1.length-1,j=series2.length-1;
        int val1=0,val2=0;
        List<List<Integer>> result=new ArrayList<>();
        while(i>=0 || j>=0) {
            int t1=(i>=0)?series1[i][0] : -1;
            int t2=(j>=0)?series2[j][0] : -1;
            int t=Math.max(t1,t2);
            if(t==t1) val1 = series1[i--][1];
            if(t==t2) val2 = series2[j--][1];
            result.add(Arrays.asList(t,val1+val2));
        }
        Collections.reverse(result);
        return result;
    }
}