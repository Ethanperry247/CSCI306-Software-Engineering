package levelPieces;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Captain extends GamePiece implements Moveable {

	public Captain(int location) {
		super('X', location);
	}

	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		int currentLocation = this.getLocation();
		
		// Checks if the player is in front of or behind the piece.
		if (currentLocation - playerLocation > 0) {
			
			// Checks if the next spot is open, and affirms that the piece won't leave the board.
			if (currentLocation - 1 > 0 && gameBoard[currentLocation - 1] == null && 
				playerLocation != this.getLocation() - 1) {
				
				// Modifies the board and sets updated location.
				gameBoard[currentLocation - 1] = gameBoard[currentLocation];
				gameBoard[currentLocation] = null;
				this.setLocation(currentLocation - 1); 
			}
		} else {
			
			// Checks if the next spot is open, and affirms that the piece won't leave the board.
			if (currentLocation + 1 < GameEngine.BOARD_SIZE && gameBoard[currentLocation + 1] == null && 
				playerLocation != this.getLocation() + 1) {
				
				// Modifies the board and sets updated location.
				gameBoard[currentLocation + 1] = gameBoard[currentLocation];
				gameBoard[currentLocation] = null;
				this.setLocation(currentLocation + 1);
			}
		}
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		// Kill player if one the same square.
		if (playerLocation == this.getLocation()) {
			return InteractionResult.KILL;
		} else return null;
	}

}
