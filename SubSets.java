public class SubSets {
    public static void subsetprint(String str,String ans ,int i){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;

        }

        //yes choice
        subsetprint(str, ans+str.charAt(i),i+1);
        //no choice
        subsetprint(str, ans, i+1);

    }
    public static void main(String[] args) {
        String str="abc";
        subsetprint(str, "", 0);
    }
    
}
