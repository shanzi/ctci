package me.exercise;

/**
 * Created by Chase_Zhang on 12/11/14.
 */
public class Ex9 {
    // eight queens problem
    private static void printChessBoard(int[] answer) {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (col == answer[row]) System.out.print('x');
                else if ((row + col) % 2 == 0) System.out.print(' ');
                else System.out.print('#');
            }
            System.out.print('\n');
        }
        System.out.println("---------");
    }

    private static void putQueenAt(int row, int column, int[] answer){
        for (int i = 0; i < row; i++) {
            if ( column == answer[i] || Math.abs(column - answer[i]) == row - i) return;
        }
        answer[row] = column;
        if (row == 7) {
            printChessBoard(answer);
        } else {
            for (int i = 0; i < column - 1; i++) {
                putQueenAt(row + 1, i, answer);
            }
            for (int i = column + 2; i < 8; i++) {
                putQueenAt(row + 1, i, answer);
            }
        }
    }
    public static void generateAnswer(){
        int[] answer = new int[8];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = -1;
        }
        for (int i = 0; i < 8; i++) {
            putQueenAt(0, i, answer);
        }
    }
}
