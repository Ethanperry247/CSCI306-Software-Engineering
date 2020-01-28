package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Cannon extends GamePiece implements Drawable {

	public Cannon(int location) {
		super('=', location);
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		// TODO Auto-generated method stub
		return null;
	}

}
