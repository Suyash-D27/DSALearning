package backtracking;

public class Suduko {
    public static void main(String[] args) {
        int[][] sudokuBoard = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if(solver(sudokuBoard)){
            display(sudokuBoard);
            System.out.println("Suduko is solved");
        }else {
            System.out.println("Suduko is not solved");
        }
    }

    public static boolean solver(int[][] board){
        int row=-1;
        int col=-1;
        int n = board.length;


        boolean EmptyLeft=true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                if(board[i][j]==0){
                    row=i;
                    col=j;
                    EmptyLeft=false;
                    break;
                }

            }
            if (EmptyLeft == false){
                break;
            }
        }
        // if found empty is row
        if(EmptyLeft==true){
            return true;
            // sudoko is slove
        }


        for (int number = 1; number <=9; number++) {
            //backtracking
            if (issafe(board,row,col,number)){
                board[row][col]=number;
                if(solver(board)){
                    return true;
                }else {
                    //backttracking
                    board[row][col]=0;
                }
            }

        }

        return false;

    }




    public static boolean issafe(int[][] board , int row, int col, int number){
        // for row check
        for (int i = 0; i <board.length; i++) {
            if (board[i][col]==number){
                return false;
            }
        }

        // for coloum check
        for (int i = 0; i <board.length; i++) {
            if (board[row][i]==number){
                return false;
            }
        }
        int sqrt = (int) Math.sqrt(board.length);
        int Startrow = row-row%sqrt;
        int Startcol = col-col%sqrt;

        for (int r = Startrow; r < Startrow + sqrt; r++) {
            for (int c = Startcol; c < Startcol + sqrt; c++) {
                if (board[r][c] == number) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void display(int[][] board){
        for (int[]nums : board) {
            for (int elements:nums){
                System.out.print(elements+" ");
            }
            System.out.println();
        }
    }
}
