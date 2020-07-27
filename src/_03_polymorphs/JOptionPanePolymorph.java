package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class JOptionPanePolymorph extends Polymorph {

	JOptionPanePolymorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(getX(), getY(), 50, 50);
	}

}
