// Last updated: 11/08/2026, 16:14:25
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String s : tokens) {
            if(s.equals("+")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a + b);
            }
            else if(s.equals("-")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a - b);
            }
            else if(s.equals("*")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a * b);
            }
            else if(s.equals("/")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a / b);
            }
            else {
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}