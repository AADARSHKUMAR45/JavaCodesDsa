import java.util.Scanner;

public class ClimbingStairs {

    public static int climbStairs(int n) {
        if (n <= 2) return n;

        int prev2 = 1;
        int prev1 = 2;
        int curr = 0;

        for (int i = 3; i <= n; i++) {
            curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return curr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of stairs: ");
        int n = sc.nextInt();

        int result = climbStairs(n);
        System.out.println("Total ways: " + result);

        sc.close();
    }
}

