public class BinaryStringProblem {
    static void PrintBinString(int n,int LastIndex,String str){
        if(n == 0){
            System.out.println(str);
            return;
        }
        PrintBinString(n-1,0,str+"0");
        if(LastIndex==0){
            PrintBinString(n-1,1,str+"1");
        }
    }
    public static void main(String[] args) {

        PrintBinString(3,0,"");
    }
}
