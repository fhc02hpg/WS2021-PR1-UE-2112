package org.campus02.basics;

public class TicTacToeHelper {

  public static char[][] generateEmptyBoard(int size) {
    char[][] board = new char[size][size];
    for(int r=0;r < board.length; r++) {
      for(int c=0; c < board[r].length; c++) {
        board[r][c] = ' ';
      }
    }
    return board;
  }

  public static boolean  validateBoard(char[][] board, int size) {
    return board.length == size && board[0].length == size;
  }

  public static void printBoard(char[][] board) {
    for(char[] row : board) {
      for(char c : row) {
        System.out.print(c + "\t");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    char[][] board = generateEmptyBoard(3);

    board[0][0] = 'X';
    board[0][1] = 'X';
    board[0][2] = 'O';

    board[1][0] = 'X';
    board[1][2] = 'O';

    board[2][0] = 'O';
    board[2][2] = 'X';

    printBoard(board);

  }

}
