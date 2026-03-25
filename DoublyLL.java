class DoublyLL{
    public class Node{
        int data;
        Node next;
        Node Prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.Prev=null;

        }
    }
    public static Node head;
    public static Node tail;
    public static int count;
    public void AddFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;

        }
        newNode.next=head;
        head.Prev=newNode;
        head=newNode;
    }
    public void print(){
        Node Temp=head;
        while(Temp!=null){
            System.out.print(Temp.data+"<->");
            Temp=Temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DoublyLL dll=new DoublyLL();
        dll.AddFirst(3);
        dll.AddFirst(2);
        dll.AddFirst(1);
        dll.print();
    }
}