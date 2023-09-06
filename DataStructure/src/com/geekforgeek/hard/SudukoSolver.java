package com.geekforgeek.hard;

public class SudukoSolver {

	public static void main(String[] args) {
		
		int grid[][] = {{3, 6, 6, 5, 0, 8, 4, 0, 0},
				{5, 2, 0, 0, 0, 0, 0, 0, 0},
				{0, 8, 7, 0, 0, 0, 0, 3, 1},
				{0, 0, 3, 0, 1, 0, 0, 8, 0},
				{9, 0, 0, 8, 6, 3, 0, 0, 5},
				{0, 5, 0, 0, 9, 0, 6, 0, 0},
				{1, 3, 0, 0, 0, 0, 2, 5, 0},
				{0, 0, 0, 0, 0, 0, 0, 7, 4},
				{0, 0, 5, 2, 0, 6, 3, 0, 0}};
		Solution.SolveSudoku(grid);
		Solution.printGrid(grid);

	}
	static class Solution
	{
	    //Function to find a solved Sudoku. 
	    static boolean SolveSudoku(int grid[][])
	    {
	        // add your code here
	        return sudokuSolver(grid, 0, 0);
	        
	    }
	    
	    public static boolean sudokuSolver(int grid[][], int row, int col){
	        if(row == 9){
	            return true;
	        }
	        
	        int nextRow = row, nextCol = col + 1;
	        if(col + 1 == 9){
	            nextRow = row + 1;
	            nextCol = 0;
	        }
	        
	        if(grid[row][col] != 0){
	            return sudokuSolver(grid, nextRow, nextCol);
	        }
	        for(int i = 1; i <= 9; i++){
	            if(isSafe(grid, row, col, i)){
	                grid[row][col] = i;
	                if(sudokuSolver(grid, nextRow, nextCol)){
	                    return true;
	                }
	                grid[row][col] = 0;
	            }
	        }
	        return false;
	    }
	    
	    public static boolean isSafe(int grid[][], int row, int col, int digit){
	        //column
	        for(int i = 0; i < 9; i++){
	            if(grid[i][col] == digit){
	                return false;
	            }
	        }
	        //row
	        for(int i = 0; i < 9; i++){
	            if(grid[row][i] == digit){
	                return false;
	            }
	        }
	        //3*3 grid
	        int sr = (row / 3) * 3;
	        int sc = (col / 3) * 3;
	        
	        for(int i = sr; i < sr + 3; i++){
	            for(int j = sc; j < sc + 3; j++){
	                if(grid[i][j] == digit){
	                    return false;
	                }
	            }
	        }
	        
	        return true;
	    }
	    
	    //Function to print grids of the Sudoku.
	    static void printGrid (int grid[][])
	    {
	        // add your code here
	        for(int i = 0; i < 9; i++){
	            for(int j = 0; j < 9; j++){
	                System.out.print(grid[i][j] + " ");
	            }
	        }
	    }
	}

}



