// Last updated: 11/08/2026, 16:07:53
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!= goal.length()) {
            return false;
        }
        return (s+s).contains(goal);
    }
}