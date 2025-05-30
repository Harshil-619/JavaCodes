import java.util.Scanner;

public class SudokuSolver {

    // Size of the Sudoku grid
    private static final int GRID_SIZE = 9;

    public static void main(String[] args) {
        int[][] board = new int[GRID_SIZE][GRID_SIZE];

        // Example puzzle (0 represents an empty cell)
        board = new int[][] {
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

        if (solveSudoku(board)) {
            System.out.println("Solved Sudoku puzzle:");
            printBoard(board);
        } else {
            System.out.println("No solution exists for the given Sudoku puzzle.");
        }
    }

    // Function to solve the Sudoku puzzle
    private static boolean solveSudoku(int[][] board) {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
                if (board[row][col] == 0) {
                    for (int numberToTry = 1; numberToTry <= GRID_SIZE; numberToTry++) {
                        if (isValidPlacement(board, numberToTry, row, col)) {
                            board[row][col] = numberToTry;

                            if (solveSudoku(board)) {
                                return true;
                            } else {
                                board[row][col] = 0; // Backtrack
                            }
                        }
                    }
                    return false; // No valid number found, trigger backtracking
                }
            }
        }
        return true; // Solved the puzzle
    }

    // Function to check if a placement is valid
    private static boolean isValidPlacement(int[][] board, int number, int row, int col) {
        return !isNumberInRow(board, number, row) &&
               !isNumberInCol(board, number, col) &&
               !isNumberInBox(board, number, row, col);
    }

    // Function to check if a number is in the row
    private static boolean isNumberInRow(int[][] board, int number, int row) {
        for (int col = 0; col < GRID_SIZE; col++) {
            if (board[row][col] == number) {
                return true;
            }
        }
        return false;
    }

    // Function to check if a number is in the column
    private static boolean isNumberInCol(int[][] board, int number, int col) {
        for (int row = 0; row < GRID_SIZE; row++) {
            if (board[row][col] == number) {
                return true;
            }
        }
        return false;
    }

    // Function to check if a number is in the 3x3 box
    private static boolean isNumberInBox(int[][] board, int number, int row, int col) {
        int localBoxRow = row - row % 3;
        int localBoxCol = col - col % 3;

        for (int i = localBoxRow; i < localBoxRow + 3; i++) {
            for (int j = localBoxCol; j < localBoxCol + 3; j++) {
                if (board[i][j] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    // Function to print the Sudoku board
    private static void printBoard(int[][] board) {
        for (int row = 0; row < GRID_SIZE; row++) {
            if (row % 3 == 0 && row != 0) {
                System.out.println("-----------");
            }
            for (int col = 0; col < GRID_SIZE; col++) {
                if (col % 3 == 0 && col != 0) {
                    System.out.print("|");
                }
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }
}
