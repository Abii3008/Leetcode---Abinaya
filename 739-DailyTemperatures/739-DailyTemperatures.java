// Last updated: 11/08/2026, 16:08:30
import java.util.*;
class Solution {
    public int[] dailyTemperatures(int[] t) {
        int[] ans = new int[t.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < t.length; i++) {
            while (!st.isEmpty() && t[i] > t[st.peek()]) {
                int j = st.pop();
                ans[j] = i - j;
            }
            st.push(i);
        }
        return ans;
    }
}