import java.util.Scanner;

public class  Zeros{

    // Function to count trailing zeroes in n!
    public static int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 5;
            count += n;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // Function call
        int result = trailingZeroes(n);

        // Output
        System.out.println("Trailing zeroes in " + n + "! = " + result);

        sc.close();
    }
}