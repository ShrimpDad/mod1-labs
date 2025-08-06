package lab3_1;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;

public class Game extends JPanel {

	Ball[] balls = new Ball[1000];

	Game() {
		Random rand = new Random();

		for (int i = 0; i < balls.length; i++) {
			int w = 20 + rand.nextInt(31);
			int h = w;

			int x = rand.nextInt(Ball.worldW - w);
			int y = rand.nextInt(Ball.worldH - h);

			int dx = 1 + rand.nextInt(20);
			int dy = 1 + rand.nextInt(20);

			if (rand.nextBoolean())
				dx = -dx;
			if (rand.nextBoolean())
				dy = -dy;

			balls[i] = new Ball(x, y, w, h, dx, dy);
		}

		JFrame frame = new JFrame();
		this.setPreferredSize(new Dimension(Ball.worldW, Ball.worldH));
		frame.add(this);
		frame.pack();
		frame.setVisible(true);
		Timer t = new Timer();
		TimerTask tt = new TimerTask() {
			@Override
			public void run() {
				draw();

			}
		};
		t.schedule(tt, 0, 50);

		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				t.cancel();
				tt.cancel();
			}
		});
		this.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				Ball.worldW = getWidth();
				Ball.worldH = getHeight();
			}
		});
	}

	public static void main(String[] args) {
		new Game();
	}

	public void draw() {
		for (Ball ball : balls) {
			ball.move();
		}
		this.repaint();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(0, 0, Ball.worldW, Ball.worldH);
		for (Ball ball : balls) {
			ball.draw(g);
		}
	}
}