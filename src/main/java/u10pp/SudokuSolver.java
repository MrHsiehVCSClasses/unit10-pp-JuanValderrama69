package u10pp;

import java.util.ArrayList;
import java.util.List;

public class SudokuSolver {
    /**
     * A Sudoku puzzle is a puzzle where you are given an n x n board and you have to fill it is so that each space contains a number 1 - n. 
     * Every row, column, and block must not have any repeating digits. A block is a square group of spaces that is sqrt(n) by sqrt(n), without overlap. 
     * There are n blocks, and they are arranged in a non-overlapping grid.
     */
    public static int[][] solve(int[][] puzzle){
        int n = puzzle.length;
        
        for(int i = 0; i < n; i++){
           for(int j = 0; j < n; j++){
               if(puzzle[i][j] == 0){
                   List<Integer> possibleValues = getPossibleValues(puzzle, i, j);
                     if(puzzle[i][j] == 0 && possibleValues.size() == 0){
                          return null;
                     }
                    else if(puzzle[i][j] == 0 && possibleValues.size() == 1){
                        puzzle[i][j] = possibleValues.get(0);
                    }
                



        
    }

    // is valid
    public static boolean isValid(int[][] puzzle){
        int n = puzzle.length;
        return false;
    }

    public static List<Integer> getPossibleValues(int[][] puzzle, int i, int j){
        List<Integer> possibleValues = new ArrayList<>();
        int n = puzzle.length;
    }

    // check if the puzzle has been solved correctlys
    public static boolean isCorrect(int[][] puzzle) {
        int n = puzzle.length;
        // loop through the rows, checking for duplicates
        for (int i = 0; i < n; i++) {
            List<Integer> temp = new ArrayList<Integer>();
            for (int j = 0; j < n; j++) {
                // check if the number is already in the list
                if(temp.contains(puzzle[i][j])){
                    return false;
                }
                temp.add(puzzle[i][j]);
            }
        }

        // loop through the columns, checking for duplicates
        for (int i = 0; i < n; i++) {
            List<Integer> temp = new ArrayList<Integer>();
            for (int j = 0; j < n; j++) {
                // check if the number is already in the list
                if(temp.contains(puzzle[j][i])){
                    return false;
                }
                temp.add(puzzle[j][i]);
            }
        }

        // loop through the blocks, checking for duplicates
        int blockSize = (int)Math.sqrt(n);
        for (int i = 0; i < n; i += blockSize) {
            for (int j = 0; j < n; j += blockSize) {
                for(int k = 0; k < blockSize; k++){
                    for(int l = 0; l < blockSize; l++){
                        List<Integer> temp = new ArrayList<Integer>();
                        if(temp.contains(puzzle[i+k][j+l])){
                            return false;
                        }
                        temp.add(puzzle[i+k][j+l]);
                    }
                }
            }
        }


        return true;

    }
}