import java.util.ArrayList;

public class MonotonicList {
    public boolean isMonotonic(ArrayList<Integer> A) {
        boolean inc = true;
        boolean dec = true;
        for (int i = 0; i < A.size() - 1; i++) {
            if (A.get(i) > A.get(i + 1)) {
                inc = false;
            }
            if (A.get(i) < A.get(i + 1)) {
                dec = false;
            }
        }
        return inc || dec;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(3);
        A.add(3);
        A.add(5);
        A.add(6);

        MonotonicList obj = new MonotonicList();
        boolean result = obj.isMonotonic(A);
        System.out.println("Is Monotonic: " + result);
    }
}