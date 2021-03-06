package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircularMovementPolymorph extends Polymorph {

	private double theta;
	
	CircularMovementPolymorph(int x, int y) {
		super(x, y);
		setTheta(0.0);
	}

	@Override
	public void update() {
		setX((int)(getX() + (Math.cos(theta) * 100)));
		setY((int)(getY() + (Math.sin(theta) * 100)));
		setTheta(getTheta() + 1);
		if (getTheta() > 360) {
			setTheta(getTheta() - 360);
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
