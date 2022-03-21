package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && (Win.horizontal(board, i) || Win.vertical(board, i))) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    public static boolean horizontal(int[][] board, int row) {
        boolean rsl = true;
        for (int column = 0; column < board.length; column++) {
            if (board[row][column] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean vertical(int[][] board, int column) {
        boolean rsl = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][column] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
