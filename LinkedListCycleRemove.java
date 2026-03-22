public class LinkedListCycleRemove {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) return true;
        }
        return false;
    }
    public static void removeCycle(ListNode head) {
        if (head == null) return;

        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Detect cycle
        boolean hasCycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }

        if (!hasCycle) return;
        slow = head;
        ListNode prev = null;

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        if (prev == null) {
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null;
        } 
        else {
            prev.next = null;
        }
    }
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = head.next.next;
        if (hasCycle(head)) {
            System.out.println("Cycle detected before removal");
        }
        removeCycle(head);
        if (hasCycle(head)) {
            System.out.println("Cycle still exists ❌");
        } else {
            System.out.println("Cycle removed successfully ✅");
        }
        printList(head);
    }
}