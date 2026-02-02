package LinkedList;

import java.util.List;

public class RemoveLoopInLL {

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
    public static void removeLoop(ListNode head) {
        if(head == null || head.next == null) {
            return;
        }

        ListNode slow = head;
        ListNode fast = head;

        // finding loop
        while (fast != null && fast.next == null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                break;
            }
        }

        // if no loop
        if(slow != fast) {
            return;
        }

        // Special case: loop starts at head
        slow = head;
        if(slow == fast) {
            while (fast.next != slow) {
                fast = fast.next;
            }
        } else {
            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }
        }

        // break the loop
        fast.next = null;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while(temp != null) {
            System.out.println(temp.val + " -> ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node2);

        RemoveLoopInLL obj = new RemoveLoopInLL();
//        ListNode result = obj.removeLoop(head);

    }
}
