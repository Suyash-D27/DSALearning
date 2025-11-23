package leetcodeproblemsSuyash;

class Solution {

    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        solveSudoku(board);
    }
    public static void solveSudoku(char[][] board) {
        solver(board);
        printBoard(board);
    }

    private static boolean solver(char[][] board) {
        int n = board.length;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (board[row][col] == '.') {
                    // try placing digits 1-9
                    for (char num = '1'; num <= '9'; num++) {
                        if (isSafe(board, row, col, num)) {
                            board[row][col] = num;

                            if (solver(board)) {
                                return true;
                            } else {
                                // backtrack
                                board[row][col] = '.';
                            }
                        }
                    }
                    // if no valid number found → dead end
                    return false;
                }
            }
        }
        // no empty cell left → solved
        return true;
    }

    private static boolean isSafe(char[][] board, int row, int col, char num) {
        int n = board.length;

        // check row
        for (int j = 0; j < n; j++) {
            if (board[row][j] == num) return false;
        }

        // check column
        for (int i = 0; i < n; i++) {
            if (board[i][col] == num) return false;
        }

        // check 3x3 sub-box
        int sqrt = (int) Math.sqrt(n);
        int startRow = row - row % sqrt;
        int startCol = col - col % sqrt;

        for (int r = startRow; r < startRow + sqrt; r++) {
            for (int c = startCol; c < startCol + sqrt; c++) {
                if (board[r][c] == num) return false;
            }
        }

        return true;
    }

    private static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}

