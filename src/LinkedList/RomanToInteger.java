package LinkedList;

public class RomanToInteger {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public int getDecimalValue(ListNode head) {
        int res = 0;
        while(head != null) {
            res = res * 2 + head.val;
            head = head.next;
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode node3 = new ListNode(1);
        ListNode node2 = new ListNode(0, node3);
        ListNode head = new ListNode(1, node2);

        RomanToInteger obj = new RomanToInteger();
        int result = obj.getDecimalValue(head);
        System.out.println("Decimal Value: " + result);


    }
}
