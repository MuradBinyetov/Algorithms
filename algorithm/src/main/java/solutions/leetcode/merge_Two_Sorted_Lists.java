package solutions.leetcode;

public class merge_Two_Sorted_Lists { //list1 = [1,2,4], list2 = [1,3,4]
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        var listNode = new ListNode();
//        while(list2.val != 0 && list2.next != null){
//            list1.next.val = list2.val;
//            list1.next.next = list2.next;
//            list2.val = list2.next.val;
//            list2.next = list2.next.next;
//        }
//
//        if(list1.val>list1.next.val){
//            var temp = list1;
//            list1.next.val =list1.val;
//            list1.next.next = temp;
//        }
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        if (list1.val < list2.val)
        {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }
        else
        {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}


