import java.util.ArrayList;


public class SwapInList {
    public static void Swap(ArrayList<Integer>list,int index1,int index2){
        int temp=index1;
        list.set(index1, list.get(index2));
        list.set(index2, temp);

}
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        int index1=3,index2=4;
        System.out.println(list);
        Swap(list, index1, index2);
        System.out.println(list);



    }
    
}
