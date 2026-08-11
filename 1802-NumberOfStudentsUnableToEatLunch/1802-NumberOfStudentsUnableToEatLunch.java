// Last updated: 11/08/2026, 16:04:21
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack <Integer> st = new Stack<>();
        Queue <Integer> q = new LinkedList<>();
        for(int i = sandwiches.length-1;i>=0;i--)
        st.push(sandwiches[i]);
        for(int stud : students)
        q.add(stud);
        int count = 0;
        while(!q.isEmpty() &&!st.isEmpty()) {
            if(q.peek() == st.peek()) {
                st.pop();
                q.poll();
                count=0;
            } else {
                q.add(q.poll());
                count++;
                if(count==q.size())
                break;

            }
        }
        return q.size();
    }
}