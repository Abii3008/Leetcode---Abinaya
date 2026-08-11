// Last updated: 11/08/2026, 16:01:41
class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        StringBuilder c = new StringBuilder();
        for(char ch : s.toCharArray()) {
            if(ch==y)a.append(ch);
            else if(ch==x) c.append(ch);
            else b.append(ch);
        }
        return a.toString()+b.toString()+c.toString();
    }
}