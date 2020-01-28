package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Parrot implements Moveable {

	public Parrot(int location) {
		
	}

	@Override
	public void draw() {
		System.out.print("^^");
	}

	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub

	}

}
