public class CheckPalindrom {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Add at beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Print list
    public void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
    public Node Findmid(Node head){
        Node Slow=head;
        Node Fast=head;
        while(Fast!=null && Fast.next!=null){
            Slow=Slow.next;
            Fast=Fast.next.next;
        }
        return Slow;

    }
    public boolean palindrom(){
        if(head==null || head.next==null){
            return true;
        }
        Node MidNode=Findmid(head);
        Node prev=null;
        Node Curr=MidNode;
        Node next;
        while(Curr!=null){
            next=Curr.next;
            Curr.next=prev;
            prev=Curr;
            Curr=next;

        }
        Node right=prev;
        Node left=head;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        CheckPalindrom list = new CheckPalindrom();

        list.addFirst(2);
        list.addFirst(1);
        list.addLast(2);
        list.addLast(1);

        System.out.println("Linked List:");
        list.printList();
        System.out.println(list.palindrom());
    }
}