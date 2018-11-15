package Entwurf;

public class Settings {
	
	public enum Seed {
		empty, cross, circle
	}
	
	public enum GameState {
		playing, draw, p1_wins, p2_wins
	}
	
	public enum Mode {
		tictactoe_2p, tictactoe_1p, vier_gewinnt, fail
	}
	
	Seed currentPlayer = Seed.cross;
	Seed content = Seed.empty;
 

}
