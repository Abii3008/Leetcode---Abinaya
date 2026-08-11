// Last updated: 11/08/2026, 16:10:51
class Solution {
    public int countSegments(String s) {
        int count=0;
        boolean inSegment = false;
        for(char c : s.toCharArray()) {
            if(c!=' ' && !inSegment) {
                count++;
                inSegment=true;
            } else if (c==' ') {
                inSegment=false;
            }
        }
        return count;
    }
}