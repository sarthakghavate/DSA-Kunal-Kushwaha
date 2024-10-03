package Recursion.Backtracking;

public class NQueens {
    public static void main(String[] args) {
        int n = 8;
        boolean [][] board = new boolean[n][n];

        System.out.println(NQueensCount(board,0));
    }

    // We have to return how many number of solutions are possible for given N Queens.
    static int NQueensCount(boolean [][] board, int row){
        // base case
        // if the last row queen has been placed correctly and then the row will get incremented so
        // when row becomes equal to no. of rows in board return 1
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        // place queen in the current cell and checking for every r and c
        for(int col = 0; col < board.length; col++){
            // put the queen if it is safe
            if(isSafe(board,row,col)){
                board[row][col] = true;
                count += NQueensCount(board,row+1);
                // came out of the function call so change it(Backtrack)
                board[row][col] = false;
            }

        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // check vertical row
        for(int i = 0; i < row ; i++){
            if(board[i][col]){
                return false;
            }
        }

        // diagonal left
        int maxLeft = Math.min(row,col);
        for(int i = 1; i  <= maxLeft; i++){
            if(board[row - i][col - i]){
                return false;
            }
        }
        // diagonal right
        int maxRight = Math.min(row,board.length-col-1);
        for(int i = 1; i  <= maxRight; i++){
            if(board[row - i][col + i]){
                return false;
            }
        }
        return true;
    }

    private static void display(boolean[][] board){
        for(boolean [] row : board){
            for(boolean el : row) {
                if (el) {
                    System.out.print("Q  ");
                } else {
                    System.out.print("X  ");
                }
            }
            System.out.println();
        }
    }
}
