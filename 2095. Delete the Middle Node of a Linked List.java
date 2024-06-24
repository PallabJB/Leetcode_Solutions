// Turtle & Hair ALGORITHIM
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null)
            return null;

        ListNode previousNode = getPreviousNodeOfMidNode(head);
        previousNode.next = previousNode.next.next;
        return head;    
    }
    public ListNode getPreviousNodeOfMidNode(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        ListNode previousNode = null;
        while(fast != null && fast.next != null){
            previousNode = slow;
            slow=slow.next;
            fast = fast.next.next;
        }
        return previousNode;
    }
}
