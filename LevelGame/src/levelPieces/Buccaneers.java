package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Buccaneers extends GamePiece implements Drawable {

	public Buccaneers(int location) {
		super('B', location);
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		
		// Hit the player if on the same square.
		if (playerLocation == this.getLocation()) {
			return InteractionResult.HIT;
		} else return InteractionResult.NONE;
	}

}
