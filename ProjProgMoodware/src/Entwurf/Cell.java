package Entwurf;

public class Cell extends Settings {
	Seed content;
	int row, col;
	
	//Constructor
	public Cell(int row, int col) {
		this.row = row;
		this.col = col;
		content = Seed.empty;
	}
	
	public void paint() {
		switch(content) {
		case cross: System.out.print("x");
		case circle: System.out.print("o");
		case empty: System.out.print(" ");
		}
	}

}
