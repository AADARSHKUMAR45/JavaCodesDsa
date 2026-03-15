import java.util.ArrayList;
public class MaxList {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(7);
        list.add(9);
        list.add(6);
        list.add(5);
        int Max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
           // if(Max<list.get(i)){
            //    Max=list.get(i);
           // }
          Max= Math.max(Max,list.get(i));
        }
        System.out.println("Maximum Value = " + Max);


    }
}
