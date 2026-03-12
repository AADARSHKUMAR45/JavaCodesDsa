import java.util.ArrayList;
public class ArrayLiist {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //list.remove(0);
        System.out.println(list);
        //int element=list.get(2);
        //System.err.println(element);
        list.set(2, 5);
        System.out.println(list.contains(1));


    }
}
