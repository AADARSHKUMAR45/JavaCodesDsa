import java.util.*;
class QueueJCF {
    public static void main(String args[]) {
        Queue<Integer>Q=new LinkedList<>();
        Q.add(1);
        Q.add(2);
        Q.add(3);
        while(!Q.isEmpty()){
            System.out.println(Q.peek());
            Q.remove();
        }
    }
}
