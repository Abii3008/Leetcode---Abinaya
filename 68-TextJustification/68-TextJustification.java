// Last updated: 11/08/2026, 16:15:46
class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> ans = new ArrayList<>();
        for (int i = 0, j; i < words.length; i = j) {
            int len = words[i].length();
            for (j = i + 1; j < words.length &&
                 len + words[j].length() + (j - i) <= maxWidth; j++) {
                len += words[j].length();
            }
            StringBuilder sb = new StringBuilder();
            int gaps = j - i - 1;
            if (j == words.length || gaps == 0) {
                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k < j - 1) sb.append(" ");
                }
                while (sb.length() < maxWidth) sb.append(" ");
            } else {
                int space = (maxWidth - len) / gaps;
                int extra = (maxWidth - len) % gaps;
                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k < j - 1) {
                        for (int s = 0; s < space + (k - i < extra ? 1 : 0); s++)
                            sb.append(" ");
                    }
                }
            }
            ans.add(sb.toString());
        }
        return ans;
    }
}