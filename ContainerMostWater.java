
import java.util.ArrayList;

public class ContainerMostWater {
    public static int MostWater(ArrayList<Integer>Heigth){
        int MaxWater=0;
        for (int i = 0; i < Heigth.size(); i++) {
            for (int j = i+1; j <Heigth.size(); j++) {
                int ht=Math.min(Heigth.get(i), Heigth.get(j));
                int Width=j-1;
                int CurrWater=ht*Width;
                MaxWater=Math.max(MaxWater, CurrWater);

                
            }

            
        }
        return MaxWater;
    }
    public static void main(String[] args) {
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
       System.out.println( MostWater(Height));


    }
}
