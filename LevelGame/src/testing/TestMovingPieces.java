package testing;

import static org.junit.Assert.*;
import levelPieces.*;

import org.junit.Test;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import levelPieces.Parrot;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.GameEngine;

public class TestMovingPieces {

	@Test
	public void testRandomMovement() {
		
		// The locations array stores the times that the randomly moving character is on
		// the various positions of the game board.
		int[] locations = new int[GameEngine.BOARD_SIZE];

		// Creates a new character on spot 10.
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Parrot parrot = new Parrot(10);
		gameBoard[10] = parrot;
		
		// Loops through 4000 times to allow the character to move randomly about the board.
		for (int i = 0; i < 4000; i++) {
			parrot.move(gameBoard, 21);
			locations[parrot.getLocation()]++;
		}
		
		// Affirms that the character has visited all spots on the board.
		for (int i = 0; i < locations.length; i++) {
			assert(locations[i] > 10);
		}
	}
	
	@Test
	public void testFollowingMovement() {
		
		// Used to affirm that the character has been on all spaces of the board 
		// when following the character.
		int[] locations = new int[20];
		
		// Creates a new character (captain) to test, starting on the farthest spot from the player.
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Captain captain = new Captain(20);
		gameBoard[20] = captain;
		
		// Allows the captain to move across the game board toward the player.
		for (int i = 0; i < 20; i++) {
			captain.move(gameBoard, 0);
			locations[captain.getLocation()]++;
		}
		
		// Affirms that the captain has visited all the positions while approaching the player.
		for (int i = 1; i < locations.length; i++) {
			assert(locations[i] >= 1);
		}
		
		// Resets the position of the captain to 0.
		locations = new int[20];
		captain = new Captain(0);
		gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		gameBoard[0] = captain;
		
		// Allows the captain to move towards the player in the center of the board.
		for (int i = 0; i < 10; i++) {
			locations[captain.getLocation()]++;
			captain.move(gameBoard, 10);
		}
		
		// Affirms that the captains approach of the player is correct.
		for (int i = 0; i < 10; i++) {
			assert(locations[i] >= 1);
		}
		
		
		
	}

}
