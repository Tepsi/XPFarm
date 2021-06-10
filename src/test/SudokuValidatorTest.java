package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import main.SudokuValidator;

class SudokuValidatorTest {


    @Test
    public void zoliTest() {
        int[][] sudokuAlap = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };
        
        int sudoku[][] = sudokuAlap;
        assertEquals(true, SudokuValidator.check(sudoku));
        
        sudoku = sudokuAlap;
        sudoku[1][7] = 9;
        sudoku[4][7] = 4;
        sudoku[4][0] = 9;
        sudoku[6][0] = 4;
        sudoku[6][8] = 9;
        sudoku[8][8] = 4;
        sudoku[8][1] = 9;
        sudoku[2][1] = 4;
        assertEquals(false, SudokuValidator.check(sudoku));
        
        sudoku = sudokuAlap;        
        sudoku[0][0] = 0;
        assertEquals(false, SudokuValidator.check(sudoku));
        
        sudoku = sudokuAlap;
        sudoku[0][0] = 3;
        assertEquals(false, SudokuValidator.check(sudoku));

        sudoku = sudokuAlap;
        sudoku[0][0] = 6;
        sudoku[0][3] = 5;
        assertEquals(false, SudokuValidator.check(sudoku));
        
        sudoku = sudokuAlap;
        sudoku[1][7] = 9;
        sudoku[0][3] = 5;
        assertEquals(false, SudokuValidator.check(sudoku));



    }


    @Test
    public void exampleTest() {
        int[][] sudoku = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };
        assertEquals(true, SudokuValidator.check(sudoku));

        sudoku[0][0]++;
        sudoku[1][1]++;
        sudoku[0][1]--;
        sudoku[1][0]--;

        assertEquals(false, SudokuValidator.check(sudoku));   
        
        sudoku[0][0]--;
        sudoku[1][1]--;
        sudoku[0][1]++;
        sudoku[1][0]++;
        
        sudoku[4][4] = 0;

        assertEquals(false, SudokuValidator.check(sudoku));
    }

}
