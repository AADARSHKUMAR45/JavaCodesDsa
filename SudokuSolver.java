public class SudokuSolver {

    static final int N = 9;

    // Function to print the board
    static void printBoard(int[][] board) {
        for (int r = 0; r < N; r++) {
            for (int d = 0; d < N; d++) {
                System.out.print(board[r][d] + " ");
            }
            System.out.println();
        }
    }

    // Check if it is safe to place num
    static boolean isSafe(int[][] board, int row, int col, int num) {

        // Check row
        for (int d = 0; d < N; d++) {
            if (board[row][d] == num) {
                return false;
            }
        }

        // Check column
        for (int r = 0; r < N; r++) {
            if (board[r][col] == num) {
                return false;
            }
        }

        // Check 3x3 box
        int sqrt = (int)Math.sqrt(N);
        int boxRowStart = row - row % sqrt;
        int boxColStart = col - col % sqrt;

        for (int r = boxRowStart; r < boxRowStart + sqrt; r++) {
            for (int d = boxColStart; d < boxColStart + sqrt; d++) {
                if (board[r][d] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    // Solve Sudoku using backtracking
    static boolean solveSudoku(int[][] board, int row, int col) {

        if (row == N - 1 && col == N) {
            return true;
        }

        if (col == N) {
            row++;
            col = 0;
        }

        if (board[row][col] != 0) {
            return solveSudoku(board, row, col + 1);
        }

        for (int num = 1; num <= N; num++) {
            if (isSafe(board, row, col, num)) {

                board[row][col] = num;

                if (solveSudoku(board, row, col + 1)) {
                    return true;
                }

                board[row][col] = 0; // backtrack
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[][] board = {
            {3,0,6,5,0,8,4,0,0},
            {5,2,0,0,0,0,0,0,0},
            {0,8,7,0,0,0,0,3,1},
            {0,0,3,0,1,0,0,8,0},
            {9,0,0,8,6,3,0,0,5},
            {0,5,0,0,9,0,6,0,0},
            {1,3,0,0,0,0,2,5,0},
            {0,0,0,0,0,0,0,7,4},
            {0,0,5,2,0,6,3,0,0}
        };

        if (solveSudoku(board, 0, 0)) {
            printBoard(board);
        } else {
            System.out.println("No solution exists");
        }
    }
}