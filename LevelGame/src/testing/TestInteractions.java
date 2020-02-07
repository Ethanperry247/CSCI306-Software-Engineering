package testing;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import levelPieces.Buccaneers;
import levelPieces.Cannon;
import levelPieces.Captain;
import levelPieces.Chest;
import levelPieces.FirstMate;
import levelPieces.Parrot;
import levelPieces.Privateer;
import gameEngine.GameEngine;


import static org.junit.Assert.*;

import org.junit.Test;

public class TestInteractions {

	@Test
	public void testBuccaneers() {
		
		// Creates a character at position 10.
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Buccaneers buccaneer = new Buccaneers(10);
		gameBoard[10] = buccaneer;
		
		// Tests the interaction when the on the same position as the player.
		// Should hit the player.
		assertEquals(InteractionResult.HIT, buccaneer.interact(gameBoard, 10));
		
		// These loops ensure no interaction if not on same space
		for (int i=0; i<10; i++)
			assertEquals(InteractionResult.NONE, buccaneer.interact(gameBoard, i));
		for (int i=11; i<GameEngine.BOARD_SIZE; i++)	
			assertEquals(InteractionResult.NONE, buccaneer.interact(gameBoard, i));
	}
	
	@Test
	public void testCannon() {
		
		// Creates a character at position 10.
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Cannon cannon = new Cannon(10);
		gameBoard[10] = cannon;
		
		// Checks for the interaction when the player is within three spaces.
		// Should hit the player.
		for (int i = 7; i < 14; i++)
			assertEquals(InteractionResult.HIT, cannon.interact(gameBoard, i));
		
		// These loops ensure no interaction if not on the interaction spaces.
		for (int i=0; i<7; i++)
			assertEquals(InteractionResult.NONE, cannon.interact(gameBoard, i));
		for (int i=14; i<GameEngine.BOARD_SIZE; i++)	
			assertEquals(InteractionResult.NONE, cannon.interact(gameBoard, i));
	}
	
	@Test
	public void testCaptain() {

		// Creates a character at position 10.
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Captain captain = new Captain(10);
		gameBoard[10] = captain;

		// Tests the interaction when the on the same position as the player.
		// Should kill the player.
		assertEquals(InteractionResult.KILL, captain.interact(gameBoard, 10));
		
		// These loops ensure no interaction if not on same space
		for (int i=0; i<10; i++)
			assertEquals(InteractionResult.NONE, captain.interact(gameBoard, i));
		for (int i=11; i<GameEngine.BOARD_SIZE; i++)	
			assertEquals(InteractionResult.NONE, captain.interact(gameBoard, i));
	}
	
	@Test
	public void testChest() {

		// Creates a character at position 10.
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Chest chest = new Chest(10);
		gameBoard[10] = chest;

		// Tests the interaction when the on the same position as the player.
		// Should advance the player to the next round.
		assertEquals(InteractionResult.ADVANCE, chest.interact(gameBoard, 10));
		
		// These loops ensure no interaction if not on same space
		for (int i=0; i<10; i++)
			assertEquals(InteractionResult.NONE, chest.interact(gameBoard, i));
		for (int i=11; i<GameEngine.BOARD_SIZE; i++)	
			assertEquals(InteractionResult.NONE, chest.interact(gameBoard, i));
	}
	
	@Test
	public void testParrot() {

		// Creates a character at position 10.
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Parrot parrot = new Parrot(10);
		gameBoard[10] = parrot;

		// Tests the interaction when the on the same position as the player.
		// Should give the player a point.
		assertEquals(InteractionResult.GET_POINT, parrot.interact(gameBoard, 10));
		
		// These loops ensure no interaction if not on same space
		for (int i=0; i<10; i++)
			assertEquals(InteractionResult.NONE, parrot.interact(gameBoard, i));
		for (int i=11; i<GameEngine.BOARD_SIZE; i++)	
			assertEquals(InteractionResult.NONE, parrot.interact(gameBoard, i));
	}
	
	@Test
	public void testFirstMate() {

		// Creates a character at position 10.
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		FirstMate firstMate = new FirstMate(10);
		gameBoard[10] = firstMate;
		
		// Checks for the interaction when the player is within two spaces.
		// Should hit the player.
		for (int i=8; i < 13; i++)
			assertEquals(InteractionResult.HIT, firstMate.interact(gameBoard, i));
		
		// These loops ensure no interaction if not on the interaction spaces.
		for (int i=0; i<8; i++)
			assertEquals(InteractionResult.NONE, firstMate.interact(gameBoard, i));
		for (int i=13; i<GameEngine.BOARD_SIZE; i++)	
			assertEquals(InteractionResult.NONE, firstMate.interact(gameBoard, i));
	}
	
	@Test
	public void testPrivateer() {

		// Creates a character at position 10.
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Privateer privateer = new Privateer(10);
		gameBoard[10] = privateer;
		
		
		// These loops ensure no interaction if not on same space.
		// Should be no interaction.
		for (int i=0; i<GameEngine.BOARD_SIZE; i++)
			assertEquals(InteractionResult.NONE, privateer.interact(gameBoard, i));
	}

}
