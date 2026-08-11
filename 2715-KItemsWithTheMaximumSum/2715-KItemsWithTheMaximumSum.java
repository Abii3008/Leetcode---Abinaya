// Last updated: 11/08/2026, 16:03:09
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
      if(numOnes>=k) {
        return k;
      } 
      int result = Math.min(numOnes , k);
      k-=numOnes+numZeros;
      if(k<0) {
        return result;
      }
      result-=Math.min(numNegOnes , k);
      return result;
       }
}