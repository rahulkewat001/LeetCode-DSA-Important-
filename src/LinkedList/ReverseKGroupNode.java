package LinkedList;

import java.util.List;

public class ReverseKGroupNode {
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

        public ListNode() {

        }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        int count = 0;

        while(curr != null && count < k) {
            curr = curr.next;
            count++;
        }

        if(count < k) {
            return head;
        }

        ListNode prev = null;
        curr = head;
        count = 0;
        while(curr != null && count < k) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        head.next = reverseKGroup(curr, k);

        return prev;
    }

    public static void print(ListNode head) {
        while (head != null) {
            System.out.println(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node2);

        ReverseKGroupNode obj = new ReverseKGroupNode();
        int k = 3;
        ListNode result = obj.reverseKGroup(head, k);
        print(result);
    }
}
