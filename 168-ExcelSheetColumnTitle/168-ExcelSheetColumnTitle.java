// Last updated: 11/08/2026, 16:14:15
class Solution {
    public String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();
        while(n > 0) {
            n--;
            result.insert(0,(char) ('A' + n % 26));
            n/= 26;
        }
        return result.toString();
    }
}