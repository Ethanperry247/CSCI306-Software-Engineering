package levelPieces;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class RollingBottle extends GamePiece implements Moveable {

	public RollingBottle(int location) {
		super('*', location);
	}

	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		
		// Generate random movement between -2 and 2.
		int randomMovement = (int)(Math.random()*5)-2;
		
		// Check to make sure that the piece does not move out put range of the game board.
		// Also checks to affirm that the character doesn't overwrite itself by moving a random length of 0.
		// Finally checks to be sure that it is moving to an empty spot.
		if (this.getLocation() + randomMovement < GameEngine.BOARD_SIZE - 1 && this.getLocation() + randomMovement > 0 &&
			gameBoard[this.getLocation() + randomMovement] == null && playerLocation != this.getLocation() + randomMovement &&
			randomMovement != 0) {
			
			// Update the new game board location.
			gameBoard[this.getLocation() + randomMovement] = gameBoard[this.getLocation()];
			
			// Set the old game board location to null.
			gameBoard[this.getLocation()] = null;
			this.setLocation(randomMovement + this.getLocation());
		}
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		return InteractionResult.NONE;
	}

}
