package solutions.leetcode;

public class linked_List_Cycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode node1 = head;
        ListNode node2 = head;
        while (node2 != null && node2.next != null) {
            node1 = node1.next;
            node2 = node2.next.next;
            if (node2 == node1) return true;
        }
        return false;
    }
}
