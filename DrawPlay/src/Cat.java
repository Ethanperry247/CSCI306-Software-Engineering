import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.*;

public class Cat {
	// drawing constants are private - noone needs to know what we're doing
	// pick a head dimension
	private static final int HEAD_DIMENSION = 200;
	// eyes will be about 1/4 from top of head and 1/4 from left
	private static final int EYE_Y = HEAD_DIMENSION/4;
	private static final int EYE_X = HEAD_DIMENSION/4;
	private static final int EYE_SEPARATION = HEAD_DIMENSION/3;
	// pick eye dimensions
	private static final int EYE_HEIGHT = 20;
	private static final int EYE_WIDTH = 20;
	// pick mouth height, width is based on head dimension
	private static final int MOUTH_HEIGHT = 10;
	private static final int MOUTH_WIDTH = HEAD_DIMENSION/4;
	// mouth starts about 40% from left edge of head
	private static final int MOUTH_X = HEAD_DIMENSION/5 * 2;
	private static final int MOUTH_Y = HEAD_DIMENSION/5 * 3;
	
	// draw will render the Cat on the Graphics object
	public void draw(Graphics g, int catX, int catY)
	{
		Graphics2D g2 = (Graphics2D) g;
		int x=catX;
		int y=catY;
		// Draw the head
		g2.setColor(Color.red);
		g2.fillOval(x, y, HEAD_DIMENSION, HEAD_DIMENSION / 2);
		// Draw the eyes
		g2.setColor(Color.getHSBColor(354, 1.0f, 0.5f));
		x = catX + EYE_X + 25; // Shift the eyes rightward.
		y = catY + EYE_Y;
		g2.fillOval(x, y, EYE_WIDTH*2, EYE_HEIGHT);
		x += EYE_SEPARATION*2; // Double the eye seperation.
		g2.fillOval(x, y, EYE_WIDTH*2, EYE_HEIGHT*4);
		g2.fillOval(x, y-30, EYE_WIDTH*7, EYE_HEIGHT*4);
		g2.fillOval(x-100, y-20, EYE_WIDTH*3, EYE_HEIGHT*4);
		// Draw the mouth
		g2.setColor(Color.orange);
		x = catX + MOUTH_X;
		y = catY + MOUTH_Y;
		g2.fillOval(x, y, MOUTH_WIDTH, MOUTH_HEIGHT*6);
		g2.setColor(Color.black);
		// Meow text appears below cat head, +10 places below 
		// so it doesn't overlap the drawing
		g2.drawString("Meow, I am a cat with big eyes. Now I have become abstract art.", catX, catY+HEAD_DIMENSION+10);	
	}
}
