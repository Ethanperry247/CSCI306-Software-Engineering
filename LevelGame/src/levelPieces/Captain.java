package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Captain extends GamePiece implements Moveable {

	public Captain(int location) {
		super('X', location);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub

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
