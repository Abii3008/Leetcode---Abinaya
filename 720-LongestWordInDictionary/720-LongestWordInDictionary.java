// Last updated: 11/08/2026, 16:08:41
class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        String s="";
        Set<String> set = new HashSet<>();
        for(String cur:words) {
            if(cur.length()==1||set.contains(cur.substring(0,cur.length()-1))){
                set.add(cur);
                if(cur.length() > s.length()) s=cur;
            }
        }
        return s;
    }
}