package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class RedPolymorph extends Polymorph{

	RedPolymorph(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	private int width;
	private int height;
	
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

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(getX(), getY(), getHeight(), getWidth());
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	
}
