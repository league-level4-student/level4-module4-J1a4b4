package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener {
	public static final int WIDTH = 600;
	public static final int HEIGHT = 600;

	ArrayList<Polymorph> pMs = new ArrayList<Polymorph>();

	private JFrame window;
	private Timer timer;

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();
	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);

		pMs.add(new BluePolymorph(300, 300, 300, 300));
		pMs.add(new RedPolymorph(300, 0, 300, 300));
		pMs.add(new BluePolymorph(0, 0, 300, 300));
		pMs.add(new RedPolymorph(0, 300, 300, 300));
		pMs.add(new MovingPolymorph(300, 300, 300, 300, -10, -300));
		pMs.add(new MovingPolymorph(0, 0, 300, 300, 10, 300));

		timer = new Timer(1000 / 30, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);

		// draw polymorph
		for (Polymorph polymorph : pMs) {
			polymorph.draw(g);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		for (Polymorph polymorph : pMs) {
			polymorph.update();
		}
	}
}
