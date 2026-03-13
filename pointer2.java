import java.util.ArrayList;
public class pointer2{
    public static int StoreWater(ArrayList<Integer>height){
        int MaxWater=0;
        int lp=0;
        int rp=height.size()-1;
        while(lp<rp){
            int ht=Math.min(height.get(lp),height.get(rp));
            int width=rp-lp;
            int CurrWater=ht*width;
            MaxWater=Math.max(MaxWater, CurrWater);
        
        if(height.get(lp)<height.get(rp)){
            lp++;

        }else{
            rp--;
        }
    }
    return MaxWater;



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
        System.out.println(StoreWater(Height));

    }

}