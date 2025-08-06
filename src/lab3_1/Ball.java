package lab3_1;

import java.awt.Graphics;
import java.util.Random;
import java.awt.Color;

public class Ball {
	public static int worldW = 600, worldH = 600;
	public int x, y, w, h;
	private int dirX, dirY;
	private Color colour;

	public Ball(int x, int y, int w, int h) {
		this(x, y, w, h, 1, 1);

	}

	public Ball(int x, int y, int w, int h, int dirX, int dirY) {

		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.dirX = dirX;
		this.dirY = dirY;
		Random rand = new Random();
		this.colour = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
	}

	public void draw(Graphics g) {
		g.setColor(colour);
		g.fillOval(x, y, w, h);
	}

	public void move() {
		x += dirX;
		y += dirY;

		if (x < 0) {
			x = 0;
			dirX = -dirX;
		} else if (x + w > Ball.worldW) {
			x = Ball.worldW - w;
			dirX = -dirX;
		}

		if (y < 0) {
			y = 0;
			dirY = -dirY;
		} else if (y + h > Ball.worldH) {
			y = Ball.worldH - h;
			dirY = -dirY;
		}
	}
}