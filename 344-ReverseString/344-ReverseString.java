// Last updated: 11/08/2026, 16:11:33
class Solution {
    public void reverseString(char[] s) {
        int a = 0;
        int b = s.length-1;
        while(a<b) {
            char temp = s[a];
            s[a] = s[b];
            s[b] = s[b];
            s[b] =  temp;
            a++;
            b--;
        }
    }
}