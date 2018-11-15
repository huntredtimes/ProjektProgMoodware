package Entwurf;
import java.util.Scanner;

//noch nicht fertig, aber ich hatte keine Lust mehr
public class Main extends Settings{
	  
	   public static void main(String[] args) { //in Datenstrukturen "initMenu"
		   System.out.println("Willkommen!");
		   System.out.println("Gebe ein für..");
		   System.out.println("TicTacToe Spieler gegen Spieler : ttt2p");
		   System.out.println("TicTacTie gegen Computer: ttt1p");
		   System.out.println("4gewinnt: 4g");
		   System.out.println("Letzter Spielstand: saved");
		   System.out.println("Um das System zu beenden: close");
		   
		   Scanner scan = new Scanner(System.in);
		   String in = scan.nextLine();
		   
		   if(in=="close") {
			   System.exit(0);
		   }
		   else {
			  chooseGame(in);
		   }
		   
	          
	}
	   public Mode chooseGame(String input) {
		   switch(input) {
		   case "ttt2p": return Mode.tictactoe_2p;
		   case "ttt1p": return Mode.tictactoe_1p;
		   case "4g": return Mode.vier_gewinnt;
		   default: return Mode.fail;
		   }
		   	   
	   }
}
