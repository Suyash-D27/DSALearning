package backtracking;

public class Nkinght {
    public static void main(String[] args) {
        int n =4;
        boolean[][] board = new boolean[n][n];
        kinghts(board,0,0,4);
    }

    public static void kinghts(boolean[][] board , int row , int col , int target){
        if(target==0){
            dislpay(board);
            System.out.println();
            return;
        }

        if(row==board.length){
            return;
        }

        if(col==board.length){
            kinghts(board,row+1,0,target);
            return;
        }

        if (issafe(board,row,col)){
            board[row][col]=true;
            kinghts(board,row,col+1,target-1);
            board[row][col]=false;
        }

        kinghts(board,row,col+1,target);

    }

    public static void dislpay (boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }

            System.out.println();
        }
    }


    public static boolean isvalid(boolean [][] board,int row, int col){
        if(row>=0&&row<board.length&&col>=0&&col<board.length){
            return true;
        }
        return false;
    }

    public static boolean issafe(boolean[][] board , int row, int col){
        if(isvalid(board,row-1,col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }
        if(isvalid(board,row-1,col+2)){
            if(board[row-1][col+2]){
                return false;
            }
        }
        if(isvalid(board,row-2,col+1)){
            if(board[row-2][col+1]){
                return false;
            }
        }
        if(isvalid(board,row-2,col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }

        return true;
    }


}
