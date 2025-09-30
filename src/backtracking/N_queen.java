package backtracking;

public class N_queen {
    public static void main(String[] args) {
        int n =4;
        boolean[][] board = new boolean[n][n];
        System.out.println( Queen(board,0));
    }

    public static int Queen (boolean[][] board , int row){
        if ( row == board.length){
            dislpay(board);
            System.out.println();
            return 1;
        }

        int count=0;

        for (int col = 0; col < board.length; col++) {
            if(isQueenissafe(board,row,col)){
                board[row][col]=true;
                count+=Queen(board,row+1);
                board[row][col]=false;

            }
        }

        return count;

    }

    private static void dislpay(boolean[][] board) {
        for (boolean[] row : board){
            for (boolean element : row){
                if(element){
                    System.out.print("Q");
                }else {
                    System.out.print("X");
                }
            }

            System.out.println();
        }
    }

    public static boolean isQueenissafe(boolean[][] board, int row, int col){
        // vertical
        for (int i = 0; i <=row; i++) {
            if(board[row-i][col]){
                return false;
            }
        }

        // daigonal left
        int minleft= Math.min(row,col);
        for (int i = 1; i <=minleft ; i++) {
            if(board[row-i][col-i]){
                return false;
            }
        }
        // daigonal right

        int maxright = Math.min(row,board.length-1-col);
            for (int i = 1; i <=maxright ; i++) {
                if(board[row-i][col+i]){
                    return false;
                }
            }

        return true;
    }

}
