package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingPolymorph extends Polymorph{

	MovingPolymorph(int x, int y, int width, int height, int speed, int oscillationDistance) {
		super(x, y);
		this.width = width;
		this.height = height;
		this.speed = speed;
		this.oscillationDistance = oscillationDistance;
	}
	
	private int width;
	private int height;
	private int speed;
	private int relativePosition;
	private int oscillationDistance;
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setWidth(int n) {
    	width = n;
    }
	
	public void setHeight(int n) {
		height = n;
    }
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int n) {
    	speed = n;
    }
	
	public int getRelativePosition() {
		return relativePosition;
	}
	
	public void setRelativePosition(int n) {
    	relativePosition = n;
    }
	
	public int getOscillationDistance() {
		return oscillationDistance;
	}
	
	public void setOscillationDistance(int n) {
    	oscillationDistance = n;
    }
	
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(getX(), getY(), getHeight(), getWidth());
	}

	@Override
	public void update() {
		setX(getX() + speed);
		setRelativePosition(getRelativePosition() + speed);
		if (getRelativePosition() == oscillationDistance) {
			speed = speed * -1;
		}else if (getRelativePosition() == 0) {
			speed = speed * -1;
		}
	}
	
}