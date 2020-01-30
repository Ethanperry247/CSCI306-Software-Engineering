package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Cannon extends GamePiece implements Drawable {

	public Cannon(int location) {
		super('=', location);
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		if (Math.abs(playerLocation - this.getLocation()) <= 3) {
			return InteractionResult.HIT;
		} else return null;
	}

}
