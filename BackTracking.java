public class BackTracking{
    public static void ArrayChange(int arr[],int index,int values){
        if(index==arr.length){
           printarr(arr);
            return;
        }
        arr[index]=values;
        ArrayChange(arr,index+1,values+1);
        arr[index]=arr[index]-2;


    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }

    public static void main(String[] args){
        int arr[]=new int[5];
        ArrayChange(arr,0,1);
        printarr(arr);
        
    }
}