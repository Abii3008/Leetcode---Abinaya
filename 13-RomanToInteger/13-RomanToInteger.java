// Last updated: 11/08/2026, 16:17:03
class Solution {
    public int value(char ch) {
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
    public int romanToInt(String s) {
        int res = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(i + 1 < s.length() && value(ch) < value(s.charAt(i + 1))) {
                res += value(s.charAt(i + 1)) - value(ch);
                i++;
            } else {
                res += value(ch);
            }
        }
        return res;
    }
}