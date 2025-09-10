# 🔢 Java Sudoku Solver

A simple Java program that solves standard 9x9 Sudoku puzzles using recursion and backtracking. Great for beginners to learn about recursion, backtracking, and constraint satisfaction.

---

## ✅ Features

- Solves any valid 9x9 Sudoku puzzle
- Uses a classic backtracking algorithm
- Input via console (supports empty cells as `.`)
- Prints the solved board to the console

---

## 🚀 How to Run

1. **Compile the files**:

***```bash
javac Main.java SudokuSolver.java

2. Run the program:
    java Main

3. Enter the Sudoku board (9 lines of 9 characters — use . for empty cells):
   Example input:
   53..7....
   6..195...
   .98....6.
   8...6...3
   4..8.3..1
   7...2...6
   .6....28.
   ...419..5
   ....8..79

-->Algorithm

The solver uses recursive backtracking:

1.Iterate over each cell

2.For empty cells ('.'), try placing digits '1' to '9'

3.Check if the digit is valid:
  *Not already in the row
  *Not already in the column
  *Not already in the 3×3 subgrid

4.If valid, place the digit and continue recursively

5.If a dead-end is reached, backtrack and try the next digit

The process continues until the board is fully solved.

📁 Project Structure
SudokuSolver/
├── Main.java            # Handles user input/output
├── SudokuSolver.java    # Contains the solver logic
└── README.md            # Project documentation

👤 Author----
VanshTanwar2006...

 

