// Last updated: 11/08/2026, 16:05:14
class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int i:arr) {
            if(set.contains(i*2) || (i%2==0 && set.contains(i/2))){
                return true;
            }
            set.add(i);
        }
        return false;
    }
}