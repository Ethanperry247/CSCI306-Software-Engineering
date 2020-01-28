package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Privateer extends GamePiece implements Moveable {
	
	public Privateer(int location) {
		super('#', location);
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
