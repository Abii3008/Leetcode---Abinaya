// Last updated: 12/09/2026, 15:12:38
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode reverseKGroup(ListNode head, int k) {
13       ListNode s = head;
14       ListNode f = head;
15       ListNode newhead = null;
16       ListNode prevtail = null;
17       while(f!=null){
18        f = s;
19        for(int i=1;i<k && f!=null ;i++){
20            f=f.next;
21        }
22        if(f==null) break;
23        ListNode nextnode =  f.next;
24        f.next = null;
25        ListNode x = reverse(s);
26        if(s == head){
27            newhead = x;
28        }
29        else{
30            prevtail.next = x;
31        }
32        prevtail = s;
33        s.next =nextnode;
34        s = nextnode;  
35       } 
36       return newhead;
37    }
38    public ListNode reverse(ListNode head){
39        if(head== null || head.next == null) return head;
40        ListNode temp = head;
41        ListNode prev = null;
42        while(temp!=null){
43            ListNode t1 = temp.next;
44            temp.next = prev;
45            prev= temp;
46            temp = t1;
47        }
48        return prev;
49    }
50}