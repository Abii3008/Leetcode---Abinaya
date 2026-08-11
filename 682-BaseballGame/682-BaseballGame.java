// Last updated: 11/08/2026, 16:08:47
class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<>();
        int sum = 0;
        for (String s : ops) {
            if (s.equals("+")) {
                int a = st.pop();
                int b = st.peek();
                st.push(a);
                st.push(a + b);
            } else if (s.equals("D"))
                st.push(2 * st.peek());
            else if (s.equals("C"))
                st.pop();
            else
                st.push(Integer.parseInt(s));
        }
        while (!st.isEmpty())
            sum += st.pop();
        return sum;
    }
}