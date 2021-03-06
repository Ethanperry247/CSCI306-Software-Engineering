package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Chest extends GamePiece implements Drawable {

	public Chest(int location) {
		super('$', location);
	}

	@Override
	public void draw() {
		System.out.print("$");
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		
		// Advance the player if one the same square.
		if (playerLocation == this.getLocation()) {
			return InteractionResult.ADVANCE;
		} else return InteractionResult.NONE;
	}

}
