// Last updated: 11/08/2026, 16:04:05
class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        for(char ch ='a' ; ch<='z' ;ch++) {
            if(sentence.indexOf(ch) <0) {
                return false;
            }
        }
        return true;
    }
}