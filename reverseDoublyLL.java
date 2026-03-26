
class reverseDoublyLL {
    public class Node {
        int data;
        Node next;
        Node Prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.Prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void AddFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.Prev = newNode;
        head = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int RemoveFirst() {
        if (head == null) {
            System.out.println("dll is empty");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.Prev = null;
        size--;
        return val;
    }

    public void reversedll() {
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.Prev = next;
            prev = curr;
            curr = next;
        }

        tail = head;
        head = prev;
    }

    public static void main(String[] args) {
        reverseDoublyLL dll = new reverseDoublyLL();

        dll.AddFirst(3);
        dll.AddFirst(2);
        dll.AddFirst(1);

        dll.print();       // 1<->2<->3<->null

        dll.reversedll();
        dll.print();       // 3<->2<->1<->null
    }
}