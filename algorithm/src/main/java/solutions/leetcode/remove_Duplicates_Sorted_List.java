package solutions.leetcode;

public class remove_Duplicates_Sorted_List {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
        {
            return head;
        }

        var curNode = head;
        while (curNode.next != null)
        {
            if (curNode.val == curNode.next.val)
            {
                curNode.next = curNode.next.next;
            }
            else
            {
                curNode = curNode.next;
            }
        }

        return head;
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
