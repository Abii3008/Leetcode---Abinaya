// Last updated: 11/08/2026, 16:08:33
import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for (int a : asteroids) {
            while (!st.isEmpty() && a < 0 && st.peek() > 0) {
                if (st.peek() < -a) {
                    st.pop();
                    continue;
                }
                if (st.peek() == -a)
                    st.pop();
                a = 0;
                break;
            }
            if (a != 0)
                st.push(a);
        }
        int[] ans = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--)
            ans[i] = st.pop();
        return ans;
    }
}