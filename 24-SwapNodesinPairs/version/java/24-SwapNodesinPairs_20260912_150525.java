// Last updated: 12/09/2026, 15:05:25
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
12    public ListNode swapPairs(ListNode head) 
13    {
14        if (head == null || head.next == null)
15        {
16            return head;
17        }
18        ListNode first = head;
19        ListNode sec = head.next;
20        ListNode prev = null;
21        while (first != null && sec != null)
22        {
23            ListNode third = sec.next;
24            sec.next = first;
25            first.next = third;
26            if (prev != null)
27            {
28                prev.next = sec;
29            }
30            else
31            {
32                head = sec;
33            }
34            prev = first;
35            first = third;
36            if (third != null)
37            {
38                sec = third.next;
39            }
40            else
41            {
42                sec = null;
43            }
44        }
45        return head;
46    }
47}