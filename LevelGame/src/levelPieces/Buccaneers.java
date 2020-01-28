package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Buccaneers extends GamePiece implements Moveable {

	public Buccaneers(int location) {
		super('B', location);
	}

	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub

	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		// TODO Auto-generated method stub
		return null;
	}

}
