import java.util.ArrayList;

public class TwoSum {
    public static boolean  Sum2(ArrayList<Integer>Height,int target){
        for(int i=0;i<Height.size();i++){
            for (int j = i+1; j <Height.size() ; j++) {
                if(Height.get(i)+Height.get(j)==target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        ArrayList<Integer>Height=new ArrayList<>();
        Height.add(1);
        Height.add(8);
        Height.add(6);
        Height.add(2);
        Height.add(5);
        Height.add(4);
        Height.add(8);
        Height.add(3);
        Height.add(7);
        System.out.println(Sum2(Height, 9));

    }
    
}
