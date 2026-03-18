import java.util.Arrays;

class Leet48 {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        for (int[] row : matrix) {
            int l = 0, r = n - 1;
            while (l < r) {
                int tmp = row[l];
                 row[l++] = row[r];
                  row[r--] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Original Matrix");
        for (int[] row : matrix)
            System.out.println(Arrays.toString(row));
        rotate(matrix);
        System.out.println("After rotated Matrix");
        for (int[] row : matrix)
            System.out.println(Arrays.toString(row));
    }
}