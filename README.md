# 🔢 Java Sudoku Solver

A simple and efficient **Sudoku Solver** implemented in **Java** using **recursion and backtracking**. Built as a beginner-friendly project to understand the fundamentals of problem solving, recursion, and constraint satisfaction.

## ✅ Features

- Solves any standard 9x9 Sudoku puzzle
- Uses classic backtracking algorithm
- Clean and modular code
- Prints solved board to console

## 🧠 Algorithm

The solver recursively fills empty cells (value `0`) by trying numbers `1-9`, ensuring:
- No repetition in the same row
- No repetition in the same column
- No repetition in the same 3x3 subgrid

If a number is valid, it's placed and the algorithm continues. If a dead-end is reached, it backtracks.

## 📁 Project Structure

The Sudoku board is represented as a 9×9 2D array of integers. Empty cells are filled with 0. The solver uses a recursive backtracking approach to try all valid numbers for each empty cell until the board is solved.
