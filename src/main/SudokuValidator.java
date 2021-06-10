package main;
public class SudokuValidator {
	public static boolean check(int[][] sudoku) {
		for (int i = 0; i < sudoku.length; i++) {
			for (int j = 0; j < sudoku[i].length; j++) {
//				Zeroes
				if (sudoku[i][j] == 0)
					return false;
//				Horizontal lines
				if (j < sudoku[i].length - 1) {
					for (int k = j + 1; k < sudoku[i].length; k++) {
						if (sudoku[i][j] == sudoku[i][k])
							return false;
					}
				}
//				Vertical lines
				if (i < sudoku.length - 1) {
					for (int k = i + 1; k < sudoku.length; k++) {
						if (sudoku[i][j] == sudoku[k][j])
							return false;
					}
				}
//				3*3 arrays
				int topLeftI = (i / 3) * 3;
				int topLeftJ = (j / 3) * 3;
				for (int k = 0; k < 3; k++) {
					for (int l = 0; l < 3; l++) {
						if (topLeftI + k != i && topLeftJ + l != j
								&& sudoku[topLeftI + k][topLeftJ + l] == sudoku[i][j])
							return false;
					}
				}
			}
		}
		return true;
	}
}
