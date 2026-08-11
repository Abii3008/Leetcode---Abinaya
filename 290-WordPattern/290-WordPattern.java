// Last updated: 11/08/2026, 16:11:56
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length)
            return false;
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> rev = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            if (map.containsKey(ch) && !map.get(ch).equals(words[i]))
                return false;
            if (rev.containsKey(words[i]) && rev.get(words[i]) != ch)
                return false;
            map.put(ch, words[i]);
            rev.put(words[i], ch);
        }
        return true;
    }
}