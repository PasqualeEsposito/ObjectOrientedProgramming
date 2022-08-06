package tris;


public class Tris {

	public Tris() {
		board = new String[ROWS][COLUMNS];
		for(int i = 0; i < ROWS; i++)
			for(int j = 0; j < COLUMNS; j++)
				board[i][j] = " ";
	}
	
	public String toString() {
		String r = "";
		for(int i = 0; i < ROWS; i++) {
			for(int j = 0; j < COLUMNS; j++) {
				r = r + board[i][j];
				if(j != (COLUMNS-1))
					r = r + "|";
			}
			if(i != (ROWS-1))
				r = r +"\n-----\n";
		}
		
		return r;
	}
	
	public void set(int i, int j, String player) {
		if(board[i][j].equals(" "))
			board[i][j] = player;
	}
	
	private String[][] board;
	private static final int ROWS = 3;
	private static final int COLUMNS = 3;
	
}
