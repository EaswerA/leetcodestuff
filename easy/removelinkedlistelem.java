class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode newn = new ListNode(0, head);
        ListNode test = newn;

        while (test != null) {
            while (test.next != null && test.next.val == val) {
               test.next = test.next.next; 
            }
            test = test.next; 
        } 
        return newn.next;        
    }
}