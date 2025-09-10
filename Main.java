import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[9][9];

        System.out.println("Enter the Sudoku board (9 lines, 9 characters each; use '.' for empty cells):");
        for (int i = 0; i < 9; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < 9; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        SudokuSolver solver = new SudokuSolver();
        solver.solveSudoku(board);

        System.out.println("\nSolved Sudoku:");
        for (char[] row : board) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

