import java.awt.*;

public class Cat {
	// Drawing constants are private - noone needs to know what we're doing
	// Pick a head dimension
	private static final int HEAD_DIMENSION = 200;

	// Eyes will be about 1/4 from top of head and 1/4 from left
	private static final int EYE_Y = HEAD_DIMENSION / 4;
	private static final int EYE_X = HEAD_DIMENSION / 4;
	private static final int EYE_SEPARATION = HEAD_DIMENSION / 3;

	// Pick eye dimensions
	private static final int EYE_HEIGHT = 20;
	private static final int EYE_WIDTH = 20;

	// Pick mouth height, width is based on head dimension
	private static final int MOUTH_HEIGHT = 10;
	private static final int MOUTH_WIDTH = HEAD_DIMENSION / 4;

	// Mouth starts about 40% from left edge of head
	private static final int MOUTH_X = HEAD_DIMENSION / 5 * 2;
	private static final int MOUTH_Y = HEAD_DIMENSION / 5 * 3;

	// Pick x and y coordinates of both ears
	private static final int[] LEFT_EAR_X = new int[]{60, 80, 100};
	private static final int[] LEFT_EAR_Y = new int[]{50, 10, 50};
	private static final int[] RIGHT_EAR_X = new int[]{200, 210, 220};
	private static final int[] RIGHT_EAR_Y = new int[]{50, 30, 50};

	// Draw will render the Cat on the Graphics object
	public void draw(Graphics g, int catX, int catY) {
		Graphics2D g2 = (Graphics2D) g;
		int x = catX;
		int y = catY;

		// Draw the head
		g2.setColor(Color.red);
		g2.fillOval(x, y, HEAD_DIMENSION, HEAD_DIMENSION / 2);

		// Draw the eyes
		g2.setColor(Color.getHSBColor(354, 1.0f, 0.5f));
		x = catX + EYE_X + 25; // Shift the eyes rightward.
		y = catY + EYE_Y;
		g2.fillOval(x, y, EYE_WIDTH * 2, EYE_HEIGHT);
		x += EYE_SEPARATION*2; // Double the eye seperation.
		g2.fillOval(x, y, EYE_WIDTH * 2, EYE_HEIGHT * 4);

		// Draw the mouth
		g2.setColor(Color.pink);
		x = catX + MOUTH_X;
		y = catY + MOUTH_Y;
		g2.fillOval(x, y, MOUTH_WIDTH, MOUTH_HEIGHT * 6);
		g2.setColor(Color.black);

		// Draw the ears
		g2.setColor(Color.getHSBColor(354, 1.0f, 0.5f));
		g2.fillPolygon(LEFT_EAR_X, LEFT_EAR_Y, 3);
		g2.fillPolygon(RIGHT_EAR_X, RIGHT_EAR_Y, 3);

		// Meow text appears below cat head, +10 places below 
		// so it doesn't overlap the drawing
		g2.drawString("Meow, I am a cat with big eyes. Now I have become abstract art.", catX, catY + HEAD_DIMENSION + 10);
	}
}
