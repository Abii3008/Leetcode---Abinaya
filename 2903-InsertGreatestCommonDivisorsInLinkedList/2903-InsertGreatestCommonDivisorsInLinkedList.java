// Last updated: 11/08/2026, 16:02:47
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            int g = gcd(cur.val, cur.next.val);
            cur.next = new ListNode(g, cur.next);
            cur = cur.next.next;
        }
        return head;
    }
    int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}