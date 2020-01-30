package gameEngine;
import java.util.ArrayList;

import levelPieces.Buccaneers;
import levelPieces.Cannon;
import levelPieces.Captain;
import levelPieces.Chest;
import levelPieces.FirstMate;
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
			GamePiece buccaneerTwo = new Buccaneers(6);
			GamePiece parrot = new Parrot(17);
			pieceList.add(chest);
			pieceList.add(buccaneerOne);
			pieceList.add(buccaneerTwo);
			pieceList.add(parrot);
			moveableList.add((Moveable) parrot);
			board[3] = chest;
			board[4] = buccaneerOne;
			board[6] = buccaneerTwo;
			board[17] = parrot;
		} else if (levelNum == 2) {
			// Reset all array lists and arrays to be sure there are not duplicates.
			pieceList = new ArrayList<GamePiece>();
			moveableList = new ArrayList<Moveable>();
			board = new Drawable[GameEngine.BOARD_SIZE];
			
			GamePiece chest = new Chest(3);
			GamePiece buccaneerOne = new Buccaneers(4);
			GamePiece buccaneerTwo = new Buccaneers(6);
			GamePiece parrot = new Parrot(17);
			GamePiece firstMate = new FirstMate(15);
			Drawable flag = new Flag();
			pieceList.add(chest);
			pieceList.add(buccaneerOne);
			pieceList.add(buccaneerTwo);
			pieceList.add(firstMate);
			pieceList.add(parrot);
			moveableList.add((Moveable) firstMate);
			moveableList.add((Moveable) parrot);
			board[1] = flag;
			board[3] = chest;
			board[4] = buccaneerOne;
			board[6] = buccaneerTwo;
			board[15] = firstMate;
			board[17] = parrot;
		} else if (levelNum == 3) {
			// Reset all array lists and arrays to be sure there are not duplicates.
			pieceList = new ArrayList<GamePiece>();
			moveableList = new ArrayList<Moveable>();
			board = new Drawable[GameEngine.BOARD_SIZE];
			
			// Instantiate all pieces for level 3.
			GamePiece chest = new Chest(3);
			GamePiece buccaneerOne = new Buccaneers(4);
			GamePiece buccaneerTwo = new Buccaneers(6);
			GamePiece parrot = new Parrot(17);
			GamePiece captain = new Captain(15);
			Drawable flag = new Flag();
			GamePiece cannon = new Cannon(2);
			
			// Add pieces to the piece list.
			pieceList.add(chest);
			pieceList.add(buccaneerOne);
			pieceList.add(buccaneerTwo);
			pieceList.add(captain);
			pieceList.add(parrot);
			pieceList.add(cannon);
			
			// Populate the movable list.
			moveableList.add((Moveable) captain);
			moveableList.add((Moveable) parrot);
			
			// Populate the board.
			board[1] = flag;
			board[2] = cannon;
			board[3] = chest;
			board[4] = buccaneerOne;
			board[6] = buccaneerTwo;
			board[15] = captain;
			board[17] = parrot;
		}
		
	}

	public int getPlayerStartLoc() {
		return GameEngine.BOARD_SIZE/2;
	}
	
	

}
