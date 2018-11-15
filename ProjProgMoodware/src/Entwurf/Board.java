package Entwurf;

import Entwurf.Settings.Seed;

public class Board extends Settings {
	
	//Evtl stattdessen immer GameMode überprüfen und in einzelnen Methoden neu bestimmen..?
	public static int ROWS;
	public static int COLS;
	
	if(Mode == tictactoe_2p || Mode == tictactoe_1p) {
		ROWS = 3;
		COLS = 3;
	}
	else {
		ROWS = 6;
		COLS = 7;
	}
	
	Cell[][] cells;
	int currentRow;
	int currentCol;
	
	//Constructor Board
	public Board() {
		cells = new Cell[ROWS][COLS];
		for (int k = 0; k < ROWS; ++k) {
			for (int i = 0; i < COLS; ++i) {
				cells[k][i] = new Cell(k, i);
			}
		}
	}
	
	public void initBoard () {
		for (int k = 0; k < ROWS; ++k) {
			for (int i = 0; i < COLS; ++i) {
				cells[k][i].content = Seed.empty;
			}
	}}
	
	public void paint() {
		
	}
	
	public boolean drawCheck() {
		for (int k = 0; k < ROWS; ++k) {
			for (int i = 0; i < COLS; ++i) {
				 if (cells[k][i].content == Seed.empty) {
		               return false;  
		            }
			}
	}
	    return true; //-> "Unentschieden"	
	}
	
	public boolean winCheck (Seed theSeed, Mode gameMode) {
		if(gameMode == tictactoe_2p || gameMode == tictactoe_1p) { //????Warum Fehlermeldung
			return (cells[currentRow][0].content == theSeed       
                && cells[currentRow][1].content == theSeed
                && cells[currentRow][2].content == theSeed
           || cells[0][currentCol].content == theSeed      
                && cells[1][currentCol].content == theSeed
                && cells[2][currentCol].content == theSeed
           || currentRow == currentCol          
                && cells[0][0].content == theSeed
                && cells[1][1].content == theSeed
                && cells[2][2].content == theSeed
           || currentRow + currentCol == 2    
                && cells[0][2].content == theSeed
                && cells[1][1].content == theSeed
                && cells[2][0].content == theSeed);
	    }
		else {
			//WinCheckViergewinnt muss noch implementiert werden!!!
		}
	  	}
		
	public void paintBoard() {
		for (int k = 0; k < ROWS; ++k) {
	         for (int i = 0; i < COLS; ++i) {
	            cells[k][i].paint();    
	            if (i < COLS - 1) System.out.print("|");
	         }
	         System.out.println();
	         if (k < ROWS - 1) {
	            System.out.println("-----------");
	         }
	      }
	}
		
	}



