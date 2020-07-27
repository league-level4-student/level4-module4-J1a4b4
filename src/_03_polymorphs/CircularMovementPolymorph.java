package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircularMovementPolymorph extends Polymorph {

	private double theta;
	
	private int originalX;
	private int modX;
	
	CircularMovementPolymorph(int x, int y) {
		super(x, y);
		setTheta(0.0);
	}

	@Override
	public void update() {
		setX((int)Math.cos(theta));
		setY((int)Math.sin(theta));
		theta = theta + 1;
		if (theta > 360) {
			theta = theta - 360;
		}
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.MAGENTA);
		g.fillRect(getX(), getY(), 50, 50);
	}

	public double getTheta() {
		return theta;
	}

	public void setTheta(double theta) {
		this.theta = theta;
	}

}
