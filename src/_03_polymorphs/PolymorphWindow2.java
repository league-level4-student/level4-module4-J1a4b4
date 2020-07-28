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

public class PolymorphWindow2 extends JPanel implements ActionListener {
	public static final int WIDTH = 600;
	public static final int HEIGHT = 600;

	ArrayList<Polymorph> pMs = new ArrayList<Polymorph>();

	private JFrame window;
	private Timer timer;

	public static void main(String[] args) {
		new PolymorphWindow2().buildWindow();
	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);

		Polymorph p = new JOptionPanePolymorph(300, 300);
		Polymorph pI = new MousePolymorph(100, 100);
		
		pMs.add(new CircularMovementPolymorph(250, 250));
		pMs.add(p);
		pMs.add(pI);

		window.addMouseListener((JOptionPanePolymorph)p);
		window.addMouseMotionListener((MousePolymorph)pI);
		
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
