package gameEngine;
import java.util.ArrayList;

import levelPieces.Buccaneers;
import levelPieces.Chest;
import levelPieces.GamePiece;
import levelPieces.Parrot;

public class LevelEngine {
	private Drawable[] board;
	private ArrayList<GamePiece> pieceList;
	private ArrayList<Moveable> moveableList;
	
	public LevelEngine() {
		pieceList = new ArrayList<GamePiece>();
		moveableList = new ArrayList<Moveable>();
		board = new Drawable[GameEngine.BOARD_SIZE];
	}

	public Drawable[] getBoard() {
		return board;
	}

	public ArrayList<GamePiece> getInteractingPieces() {
		return pieceList;
	}

	public ArrayList<Moveable> getMovingPieces() {
		return moveableList;
	}

	public void createLevel(int levelNum) {
		if (levelNum == 1) {
			GamePiece chest = new Chest(3);
			GamePiece buccaneerOne = new Buccaneers(4);
			GamePiece buccaneerTwo = new Buccaneers(5);
			Moveable parrot = new Parrot(17);
			pieceList.add(chest);
			pieceList.add(buccaneerOne);
			pieceList.add(buccaneerTwo);
			moveableList.add(parrot);
			board[3] = chest;
			board[4] = buccaneerOne;
			board[5] = buccaneerTwo;
			board[17] = parrot;
		}
		
	}

	public int getPlayerStartLoc() {
		return GameEngine.BOARD_SIZE/2;
	}
	
	

}
