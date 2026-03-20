public class RotateList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Step 1: Find length
        ListNode temp = head;
        int length = 1;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }

        // Step 2: Make circular
        temp.next = head;

        // Step 3: Find new tail
        k = k % length;
        int stepsToNewHead = length - k;

        ListNode newTail = temp;
        while (stepsToNewHead-- > 0) {
            newTail = newTail.next;
        }

        // Step 4: Break circle
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }

    // Helper to print list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Creating list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        System.out.print("Original: ");
        printList(head);

        head = rotateRight(head, k);

        System.out.print("Rotated: ");
        printList(head);
    }
}