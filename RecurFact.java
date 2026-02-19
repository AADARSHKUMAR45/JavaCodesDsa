public class RecurFact {
    static int factorial(int n){
        if(n==0) return 1;
        int fact1=factorial(n-1);
        int fact2=n*factorial(n-1);
        return fact2;
    }
    static int Sum(int n){
        if(n==1) return 1;
        int sum1=Sum(n-1);
        int sum2=n+sum1;
        return sum2;
    }
    public static void main(String[] args){
       int n=5;
       System.out.println(Sum(n));
       System.out.println(factorial(n));

    }
}
