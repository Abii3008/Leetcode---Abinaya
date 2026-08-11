// Last updated: 11/08/2026, 16:04:13
class Solution {
    public boolean halvesAreAlike(String s) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < s.length() / 2; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1)
                count++;
        }
        for (int i = s.length() / 2; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) != -1)
                count--;
        }
        return count == 0;
    }
}