package Entwurf;
import java.util.Scanner;

public class Game extends Settings{
	Board board;
	GameState currentState;
	Seed currentPlayer;
	
	Scanner input = new Scanner(System.in);
	
	//Constructor
	public Game() {
	      board = new Board();   
	 
	       
	      initGame();
 
	      do {
	         playerMove(currentPlayer);  
	         board.paint();              
	         updateGame(currentPlayer);  
	          
	         if (currentState == GameState.p1_wins) {
	            System.out.println("Spieler 1 hat gewonnen!");
	         } else if (currentState == GameState.p2_wins) {
	            System.out.println("Spieler 2 hat gewonnen!");
	         } else if (currentState == GameState.draw) {
	            System.out.println("Unentschieden (keine freien Felder übrig)");
	         }
	         
	         currentPlayer = (currentPlayer == Seed.cross) ? Seed.circle : Seed.cross;
	      } while (currentState == GameState.playing);   
	   }
	 
	   /** Methodenimplementierung*/
	   public void initGame() {
	      board.initBoard();   
	      currentPlayer = Seed.cross;       
	      currentState = GameState.playing;  
	   }
	 
	   /** Spielzug und Eingabe */
	   public void playerMove(Seed theSeed, Mode gameMode) {
		  if(gameMode == tictactoe_2p || gameMode == tictactoe_1p) {
	      boolean valid = false;   
	      do {
	         if (theSeed == Seed.cross) {
	            System.out.print("Spieler 1 ist am Zug (zeile[1-3] spalte[1-3]): ");
	         } else {
	            System.out.print("Spieler 2 ist am Zug (zeile[1-3] spalte[1-3]): ");
	         }
	         int row = input.nextInt() - 1;
	         int col = input.nextInt() - 1;
	         if (row >= 0 && row < Board.ROWS && col >= 0 && col < Board.COLS
	               && board.cells[row][col].content == Seed.empty) {
	            board.cells[row][col].content = theSeed;
	            board.currentRow = row;
	            board.currentCol = col;
	            valid = true;  
	         } else {
	            System.out.println("Feld (" + (row + 1) + "," + (col + 1)
	                  + ") ist schon besetzt, mache eine neue Eingabe!");
	         }
	      } while (!valid);    
	      }
		  else {
			  //Spielzug für 4gewinnt muss noch implementiert werden
		  }
	   }
	 
	   public void updateGame(Seed theSeed, Mode gameMode) {
	      if (board.winCheck (theSeed, gameMode)) {   
	         currentState = (theSeed == Seed.cross) ? GameState.p1_wins : GameState.p2_wins;
	      } else if (board.drawCheck()) {   
	         currentState = GameState.draw;
	      }
	     
	   }
	   
	   public void save (Seed theSeed) {
		   //Speichert nach jedem Zug Spielstand, muss noch implementiert werden
	   }
	   
	   public void load () {
		   //öffnet Spielstand, muss noch implementiert werden (evtl besser in Main??)
	   }
	   
	   //evtl kompletten minMax in neue Klasse?
	   public void minMax () {
		   //muss noch implementiert werden, ruft initTree und searchTree auf
	   }
	 
	   void initTree(Seed theSeed) {
		   //muss noch implementiert werden, stellt suchbaum auf
	   }
	   
	   Cell[][] searchTree(Seed theSeed) {
		   //muss noch implementiert werden, sucht besten zug
		   return Cell[row][col]; //? xD
	   }
}