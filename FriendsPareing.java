public class FriendsPareing {

    static int FriendPair(int n){
        //base case
        if(n==1 ||n==2){
            return n;
        }
         //single
       // int fn1=FriendPair(n-1);
        //pairs me rahe tab
       // int fn2=FriendPair(n-2);
       // int Ways=(n-1)*fn2;
       // int TotalWays=fn1+Ways;
       // return TotalWays;
        return FriendPair(n-1)+(n-1)*FriendPair(n-2);


    }
    public static void main(String[] args) {
        System.out.println(FriendPair(3));

    }
}