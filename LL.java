import java.util.LinkedList;
class LL{
    public static void main(String[] args){
        LinkedList<Integer>ll=new LinkedList<>();
        ll.addLast(3);
        ll.addLast(2);
        ll.addFirst(1);
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);
    }
}