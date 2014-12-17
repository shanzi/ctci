package me.exercise;

/**
 * Created by chase on 14-12-17.
 */
public class Ex2 {

    public static boolean winGameArray(short[][] board, int player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][2] == player) return true;
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[i][2] == player) return true;
        }

        if (board[0][0] == board[1][1]  && board[1][1] == board[2][2] && board[2][2] == player) return true;
        else return (board[0][2] == board[1][1]  && board[1][1] == board[2][0] && board[2][0] == player);
    }

    public static boolean winGameArray(short[][] board) {
        return winGameArray(board, 1) || winGameArray(board, -1);
    }

    public static boolean winGameBit(int board){
        return ((board & 0b111000000) == 0b111000000 ||
                (board & 0b000111000) == 0b000111000 ||
                (board & 0b000000111) == 0b000000111 ||
                (board & 0b100100100) == 0b100100100 ||
                (board & 0b010010010) == 0b010010010 ||
                (board & 0b001001001) == 0b001001001 ||
                (board & 0b100010001) == 0b100010001 ||
                (board & 0b001010100) == 0b001010100);
    }

    public static boolean winGameBit(int board1, int board2) throws Exception{
        if ((board1 & board2) > 0) throw new Exception("Invalid boards");
        return winGameBit(board1) || winGameBit(board2);
    }
}
