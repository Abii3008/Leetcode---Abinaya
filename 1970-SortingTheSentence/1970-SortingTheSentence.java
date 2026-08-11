// Last updated: 11/08/2026, 16:04:02
class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] result = new String[words.length];
        for(String word:words) {
            int pos = word.charAt(word.length()-1)-'1';
            result[pos] = word.substring(0,word.length()-1);
        }
        return String.join(" ",result);
    }
}