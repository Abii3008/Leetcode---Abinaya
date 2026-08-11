// Last updated: 11/08/2026, 16:16:03
class Solution {
    public int lengthOfLastWord(String s) {
        String[] a = s.trim().split(" ");
        return a[a.length - 1].length();
    }
}
