package week_06;


public class EightQueens {
    private static final int BOARD_SIZE = 8;
    private static int[] queens = new int[BOARD_SIZE];

    public static void main(String[] args) {
        solve(0);
    }

    public static void solve(int row) {
        if (row == BOARD_SIZE) {
            printQueens();
        } else {
            for (int column = 0; column < BOARD_SIZE; column++) {
                queens[row] = column;
                if (isValid(row)) {
                    solve(row + 1);
                }
            }
        }
    }

    public static boolean isValid(int row) {
        for (int i = 0; i < row; i++) {
            if (queens[i] == queens[row] || Math.abs(queens[i] - queens[row]) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }

    public static void printQueens() {
        System.out.println("Solution:");
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int column = 0; column < BOARD_SIZE; column++) {
                if (queens[row] == column) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}

